package org.o2i.jackrabbit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

import org.o2i.jackrabbit.util.DataBase;

public class NodeDAO {
	
	private Connection connection = DataBase.getConnection();
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	public void addNode(Node node) throws SQLException, RepositoryException{		
		
		String sql ="call insert_node";
		psmt = connection.prepareStatement(sql);
		psmt.setString(1, node.getIdentifier());
		
		
	}
	
	public void updateNode(String identifier){
		String sql = "call update_node";
		
	}
	
	public void removeNode(String identifier){
		String sql = "call delete_node";		
		
	}
	
	

}
