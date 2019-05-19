package com.rajkamal.web.app.service;

import java.util.List;

import com.rajkamal.web.app.mapping.Product;

public interface ServiceProduct {

	public List<Product> getAllProducts();
	
	public Product getProductByName(String productName);
	
	public List<Product> getProductNameLike(String productNameLike);
}
