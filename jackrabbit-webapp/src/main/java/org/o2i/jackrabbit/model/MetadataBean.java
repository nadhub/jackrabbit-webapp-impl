package org.o2i.jackrabbit.model;

public class MetadataBean {
	
	private Long metadataId;
	private String metadataName;
	private String metaValue;
	
	public MetadataBean() {
	}

	public MetadataBean(String metadataName, String metaValue) {
		super();
		this.metadataName = metadataName;
		this.metaValue = metaValue;
	}

	public Long getMetadataId() {
		return metadataId;
	}

	public void setMetadataId(Long metadataId) {
		this.metadataId = metadataId;
	}

	public String getMetadataName() {
		return metadataName;
	}

	public void setMetadataName(String metadataName) {
		this.metadataName = metadataName;
	}

	public String getMetaValue() {
		return metaValue;
	}

	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue;
	}

	@Override
	public String toString() {
		return "Metadata [metadataId=" + metadataId + ", metadataName="
				+ metadataName + ", metaValue=" + metaValue + "]";
	}
	
	
	
	

}
