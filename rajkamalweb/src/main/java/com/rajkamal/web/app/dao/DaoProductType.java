package com.rajkamal.web.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajkamal.web.app.mapping.ProductType;

@Repository
public interface DaoProductType extends JpaRepository<ProductType, Integer>{
	
	public ProductType findByName(String name);
	
	public List<ProductType> findByNameContaining(String name);

}
