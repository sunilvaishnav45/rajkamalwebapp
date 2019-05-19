package com.rajkamal.web.app.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajkamal.web.app.dao.DaoCompany;
import com.rajkamal.web.app.mapping.Company;
import com.rajkamal.web.app.service.ServiceCompany;

@Service("serviceCompany")
@Transactional(rollbackOn = Exception.class)
public class ServiceCompanyImpl implements ServiceCompany{
	
	@Autowired
	private DaoCompany daoCompany;
	

	public List<Company> getAllCompnies() {
		return daoCompany.findAll();
	}

	public Company getCompanyByName(String companyName) {
		return daoCompany.findByName(companyName);
	}

	public List<Company> getCompanyNameLike(String companyNameLike) {
		return daoCompany.findByNameContaining(companyNameLike);
	}

}
