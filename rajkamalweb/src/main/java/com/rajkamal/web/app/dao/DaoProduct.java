package com.rajkamal.web.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajkamal.web.app.mapping.Product;

@Repository
public interface DaoProduct extends JpaRepository<Product, Integer>{
	
	public Product findByName(String name);
	
	public List<Product> findByNameContaining(String name);

}
