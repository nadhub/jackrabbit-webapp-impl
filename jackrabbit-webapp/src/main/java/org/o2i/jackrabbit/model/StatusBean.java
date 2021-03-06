package org.o2i.jackrabbit.model;

public class StatusBean {
	
	private Long statusId;
	private String statusName;
	
	public StatusBean() {
	}

	public StatusBean(String statusName) {		
		this.statusName = statusName;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusName=" + statusName
				+ "]";
	}
	
	
	

}
