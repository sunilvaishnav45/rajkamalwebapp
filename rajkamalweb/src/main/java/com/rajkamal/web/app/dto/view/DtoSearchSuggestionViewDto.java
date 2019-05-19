package com.rajkamal.web.app.dto.view;

import com.rajkamal.web.app.enums.EnumSearcherType;

public class DtoSearchSuggestionViewDto {
	
	private EnumSearcherType enumSearcherType;
	
	private String result;

	public EnumSearcherType getEnumSearcherType() {
		return enumSearcherType;
	}

	public void setEnumSearcherType(EnumSearcherType enumSearcherType) {
		this.enumSearcherType = enumSearcherType;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
