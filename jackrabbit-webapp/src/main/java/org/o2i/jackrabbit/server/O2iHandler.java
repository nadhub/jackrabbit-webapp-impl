package org.o2i.jackrabbit.server;

import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.RepositoryException;

import org.apache.jackrabbit.JcrConstants;
import org.apache.jackrabbit.server.io.DefaultHandler;
import org.apache.jackrabbit.server.io.ImportContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class O2iHandler extends DefaultHandler {

	private static final Logger LOG = LoggerFactory.getLogger(O2iHandler.class);	

	
	@Override
	protected Node getContentNode(ImportContext context, boolean isCollection)
			throws RepositoryException {

		Node parentNode = (Node) context.getImportRoot();
		String name = context.getSystemId();
		if (parentNode.hasNode(name)) {
			parentNode = parentNode.getNode(name);
		} else {
			String ntName = (isCollection) ? getCollectionNodeType()
					: getNodeType();
			parentNode = parentNode.addNode(name, ntName);

			/**
			 * Surcharge
			 */
			System.out.println(ntName);

			if (ntName == getCollectionNodeType()) {

				parentNode.setProperty(CustomType.PROP_FOLDER_TYPE.toString(), 0);

			} else if (ntName == getNodeType()) {

				parentNode.setProperty(CustomType.PROP_FILE_TYPE.toString(), 1);
				// LOG.info("Ajout de la properiété  :" +
				// parentNode.getProperty(CustomType.PROP_FILE_TYPE.toString()));
			}

			// ////
		}
		Node contentNode = null;
		if (isCollection) {
			contentNode = parentNode;
		} else {
			if (parentNode.hasNode(JcrConstants.JCR_CONTENT)) {
				contentNode = parentNode.getNode(JcrConstants.JCR_CONTENT);
				// check if nodetype is compatible (might be update of an
				// existing file)
				if (contentNode.isNodeType(getContentNodeType())
						|| !forceCompatibleContentNodes()) {
					// remove all entries in the jcr:content since replacing
					// content
					// includes properties (DefaultHandler) and nodes (e.g.
					// ZipHandler)
					if (contentNode.hasNodes()) {
						NodeIterator it = contentNode.getNodes();
						while (it.hasNext()) {
							it.nextNode().remove();
						}
					}
				} else {
					contentNode.remove();
					contentNode = null;
				}
			}
			if (contentNode == null) {
				// JCR-2070: Use the predefined content node type only
				// when the underlying repository allows it to be used
				if (parentNode.getPrimaryNodeType().canAddChildNode(
						JcrConstants.JCR_CONTENT, getContentNodeType())) {
					contentNode = parentNode.addNode(JcrConstants.JCR_CONTENT,
							getContentNodeType());
				} else {
					contentNode = parentNode.addNode(JcrConstants.JCR_CONTENT);
				}
			}
		}
		return contentNode;

	}
	
	

}
