package com.rajkamal.web.app.enums;

public enum EnumSearcherType {
	
	Product("Product"),Company("Comapny"),ProductType("Type");
	
	private String displayName;
	
	private EnumSearcherType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
	
}
