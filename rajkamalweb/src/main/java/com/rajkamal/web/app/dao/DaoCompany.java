package com.rajkamal.web.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajkamal.web.app.mapping.Company;

@Repository
public interface DaoCompany extends JpaRepository<Company, Integer>{
	
	public Company findByName(String name);
	
	public List<Company> findByNameContaining(String name);

}
