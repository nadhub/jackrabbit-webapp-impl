package org.o2i.jackrabbit.util;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

import org.apache.jackrabbit.JcrConstants;
import org.o2i.jackrabbit.model.NodeBean;
import org.o2i.jackrabbit.model.StatusBean;
import org.o2i.jackrabbit.model.UserBean;
import org.o2i.jackrabbit.server.CustomType;

public class NodeUtil {

	public static NodeBean nodeJcrToNodeBean(Node node) throws RepositoryException {
		
				
		String nodeId = node.getIdentifier();
		String nodeName = node.getName();
		Long typeFolder = node.getProperty(CustomType.PROP_FOLDER_TYPE.toString()).getLong();
		//Long typeFile = node.getProperty(CustomType.PROP_FILE_TYPE.toString()).getLong();
		String lastModifiedFolder = node.getProperty(JcrConstants.JCR_LASTMODIFIED).getString();
	//	String lastModifiedFile = node.getNode(JcrConstants.JCR_CONTENT).getProperty(JcrConstants.JCR_LASTMODIFIED).getString();
		String userNode = node.getProperty("jcr:createdBy").getString();
		

		NodeBean nb = new NodeBean();
		nb.setNodeId(nodeId);
		nb.setLabel(nodeName);	
		nb.setUser(new UserBean(userNode));
		nb.setType(typeFolder);				
		nb.setLastModified(lastModifiedFolder);
		nb.setStatus(new StatusBean("En cours"));
		
//			if (node.getPrimaryNodeType().getName().equals(CustomType.NODE_FOLDER.toString())) {
//				nb.setType(typeFolder);				
//				nb.setLastModified(lastModifiedFolder);
//				
//			} else if (node.getPrimaryNodeType().getName().equals(CustomType.NODE_FILE.toString())) {
//				nb.setType(typeFile);
//				nb.setLastModified(lastModifiedFile);
//			}
			
		return nb;
	}

}
