package org.o2i.jackrabbit.model;

import java.util.HashMap;
import java.util.Map;

public class RefMetadataBean {
	
	private Long refMetadataId;
	private String refMetadataName;
	private Map<String, String> listMetadata;
	
	public RefMetadataBean() {
		this.listMetadata = new HashMap<String, String>();
	}

	public RefMetadataBean(String refMetadataName) {
		this.listMetadata = new HashMap<String, String>();
		this.refMetadataName = refMetadataName;
	}

	public Long getRefMetadataId() {
		return refMetadataId;
	}

	public void setRefMetadataId(Long refMetadataId) {
		this.refMetadataId = refMetadataId;
	}

	public String getRefMetadataName() {
		return refMetadataName;
	}

	public void setRefMetadataName(String refMetadataName) {
		this.refMetadataName = refMetadataName;
	}

	public Map<String, String> getListMetadata() {
		return listMetadata;
	}

	public void setListMetadata(Map<String, String> listMetadata) {
		this.listMetadata = listMetadata;
	}

	@Override
	public String toString() {
		return "RefMetadata [refMetadataId=" + refMetadataId
				+ ", refMetadataName=" + refMetadataName + "]";
	}
	
	
	
	

}
