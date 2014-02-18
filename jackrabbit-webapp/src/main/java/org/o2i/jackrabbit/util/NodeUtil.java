package org.o2i.jackrabbit.util;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

import org.o2i.jackrabbit.model.NodeBean;
import org.o2i.jackrabbit.server.CustomType;

public class NodeUtil {
	
	public void nodeJcrToNodeBean(Node node) throws RepositoryException{
		
		NodeBean nb = new NodeBean();
		nb.setLabel(node.getName());
		
			if (node.getPrimaryNodeType().getName().equals(CustomType.NODE_FOLDER.toString())) {				
				//nb.setType((node.getProperty((CustomType.PROP_FOLDER_TYPE.toString()));
			}
		
	}

}
