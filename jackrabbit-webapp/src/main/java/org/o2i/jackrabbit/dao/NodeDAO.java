package org.o2i.jackrabbit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.jcr.RepositoryException;

import org.o2i.jackrabbit.model.NodeBean;
import org.o2i.jackrabbit.util.DataBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NodeDAO {
	
	public static final Logger LOG = LoggerFactory.getLogger(NodeDAO.class);
	
	private Connection connection = DataBase.getConnection();
	private PreparedStatement psmt;
	private int rs;
	
	
	public void addNode(NodeBean nodeBean) throws SQLException, RepositoryException{		
		
		String sql ="call insert_node(?,?,?,?,?,?)";
		psmt = connection.prepareStatement(sql);		
		psmt.setString(1, nodeBean.getNodeId());
		psmt.setString(2, String.valueOf(nodeBean.getType()));
		psmt.setString(3, nodeBean.getLabel());
		psmt.setString(4, nodeBean.getLastModified());
		psmt.setString(5, nodeBean.getUser().getFirstName());
		psmt.setString(6, nodeBean.getStatus().getStatusName());
	
		rs = psmt.executeUpdate();
		if (rs > 1) {
			LOG.info("Persistance des données du node s'est bien déroulée OK !!");
		}else {
			 LOG.info("Une erreur est survenu lors de la persistance des données du node !!!!");
		}		
	}
	
	public void updateNode(String identifier){
		String sql = "call update_node";
		
	}
	
	public void removeNode(String identifier){
		String sql = "call delete_node";		
		
	}
	
	

}
