package org.o2i.jackrabbit.model;


public class NodeBean {
	
	private Long nodeId;
	private String label;
	private UserBean user;
	private String lastModified;
	private StatusBean status;
	private Long type;
	//private List<RefMetadata> refMetadata;
	
	public NodeBean() {
	//	this.refMetadata = new ArrayList<RefMetadata>();
	}

	public NodeBean(String label, UserBean user, String lastModified,
			StatusBean status, Long type) {
	//	this.refMetadata = new ArrayList<RefMetadata>();
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

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public StatusBean getStatus() {
		return status;
	}

	public void setStatus(StatusBean status) {
		this.status = status;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Node [nodeId=" + nodeId + ", label=" + label + ", user=" + user
				+ ", lastModified=" + lastModified + "]";
	}
	
	

}
