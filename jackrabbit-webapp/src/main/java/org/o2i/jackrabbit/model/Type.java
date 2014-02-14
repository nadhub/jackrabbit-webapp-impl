package org.o2i.jackrabbit.model;

public class Type {
	
	private Long typdeId;
	private String typeName;
	
	
	
	public Type() {
	}

	public Type(String typeName) {
		this.typeName = typeName;
	}

	public Long getTypdeId() {
		return typdeId;
	}

	public void setTypdeId(Long typdeId) {
		this.typdeId = typdeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "Type [typdeId=" + typdeId + ", typeName=" + typeName + "]";
	}
	
	

}
