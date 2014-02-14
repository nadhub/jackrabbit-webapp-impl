package org.o2i.jackrabbit.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Node {
	
	private Long nodeId;
	private String label;
	private User user;
	private Date lastModified;
	private Status status;
	private Type type;
	private List<RefMetadata> refMetadata;
	
	public Node() {
		this.refMetadata = new ArrayList<RefMetadata>();
	}

	public Node(String label, User user, Date lastModified,
			Status status, Type type) {
		this.refMetadata = new ArrayList<RefMetadata>();
		this.label = label;
		this.user = user;
		this.lastModified = lastModified;
		this.status = status;
		this.type = type;
	}

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Node [nodeId=" + nodeId + ", label=" + label + ", user=" + user
				+ ", lastModified=" + lastModified + "]";
	}
	
	

}
