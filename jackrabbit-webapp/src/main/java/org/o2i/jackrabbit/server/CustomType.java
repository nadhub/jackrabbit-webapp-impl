package org.o2i.jackrabbit.server;

public enum CustomType {

	// Node Type

	NODE_O2I("o2i"),

	
	
	
	// Prrperty
	NODE_USER("user");

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
