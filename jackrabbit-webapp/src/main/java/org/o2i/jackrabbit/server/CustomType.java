package org.o2i.jackrabbit.server;

public enum CustomType {

	/**
	 * Nodes
	 */

	NODE_AIFLOW("AiFlow"),
	NODE_USER("User"),
	NODE_STATUS("Status"),
	NODE_TYPE("Type"),
	NODE_METADATA("Metadata"),
	NODE_USER_LIST("UserList"),
	NODE_TYPE_LIST("TypeList"),
	NODE_STATUS_LIST("StatusList"),
	NODE_METADATA_LIST("MetadataList"),
	
	/**
	 * PROPERTY
	 */
	
	PROP_LABEL("label"),
	PROP_MEMBRE("membre"),
	PROP_REF_METADATA("refMetadata"),
	PROP_STATUS("status"),
	PROP_USER("user"),
	PROP_TYPE("type"),
	PROP_METADATA("metadata"),
	PROP_META_NAME("metaName"),
	PROP_META_VALUE("metaValue");
	
	/** namesapce */
	private final String NS = "o2:";

	/**
	 *  attribut typeName 
	*/
	private String type;

	private CustomType(String type) {
		this.type = type;
	}

	public String getType() {
		return NS + type;
	}

	@Override
	public String toString() {
		return NS + type;
	}
}
