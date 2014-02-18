package org.o2i.jackrabbit.server;

public enum CustomType {

	/**
	 * Nodes
	 */
	
	NODE_FOLDER("Folder"),
	NODE_FILE("File"),
	NODE_USER("User"),
	NODE_STATUS("Status"),
	NODE_METADATA("Metadata"),
	NODE_USER_LIST("UserList"),
	NODE_STATUS_LIST("StatusList"),
	NODE_METADATA_LIST("MetadataList"),
	
	
	/**
	 * PROPERTY
	 */
	
	PROP_FOLDER_TYPE("typeFolder"),	
	PROP_FOLDER_USER("user"),	
	
	PROP_FILE_STATUS("status"),
	PROP_FILE_TYPE("typeFile"),
	
	
	PROP_USER_FIRSTNAME("firstName"),	
	PROP_USER_LASTNAME("lastName"),	
	PROP_USER_IS_VALID("isValid"),	
	PROP_USER_LOGIN("login"),	
	
	PROP_REF_METADATA("refMetadata"),
	PROP_METADATA("metadata"),
	PROP_META_NAME("metaName"),
	PROP_META_VALUE("metaValue"),
	
	PROP_STATUS_LIST_NAME("statusName");
	
	/** namesapce */
	private final String NS = "o2i:";

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
