package com.rajkamal.web.app.service;

import java.util.List;

import com.rajkamal.web.app.dto.view.DtoSearchSuggestionViewDto;
import com.rajkamal.web.app.mapping.ProductType;

public interface ServiceProductType {
	
	/**
	 * To get all product type
	 * @return
	 */
	public List<ProductType> getAllProductTypes();
	
	/**
	 * To get product by  name
	 * @param productTypeName
	 * @return
	 */
	public ProductType getProductTypeByName(String productTypeName);

	/**
	 * To get all product by name like
	 * @param productTypeNameLike
	 * @return
	 */
	public List<ProductType> getProductTypeNameLike(String productTypeNameLike);
	
	/**
	 * This method will return all possible result found for Companies by name
	 * @param query
	 * @return
	 */
	public List<DtoSearchSuggestionViewDto> getSuggestionFor(String query);

}
