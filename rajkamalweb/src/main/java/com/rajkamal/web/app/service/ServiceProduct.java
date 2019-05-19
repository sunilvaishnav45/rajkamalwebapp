package com.rajkamal.web.app.service;

import java.util.List;

import com.rajkamal.web.app.dto.view.DtoSearchSuggestionViewDto;
import com.rajkamal.web.app.mapping.Product;

public interface ServiceProduct {

	/**
	 * 
	 * @return
	 */
	public List<Product> getAllProducts();
	
	/**
	 * 
	 * @param productName
	 * @return
	 */
	public Product getProductByName(String productName);
	
	/**
	 * 
	 * @param productNameLike
	 * @return
	 */
	public List<Product> getProductNameLike(String productNameLike);
	
	/**
	 * This method will return all possible result found for Companies by name
	 * @param query
	 * @return
	 */
	public List<DtoSearchSuggestionViewDto> getSuggestionFor(String query);
}
