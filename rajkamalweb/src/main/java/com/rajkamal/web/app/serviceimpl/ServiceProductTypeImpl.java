package com.rajkamal.web.app.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajkamal.web.app.dao.DaoProductType;
import com.rajkamal.web.app.mapping.ProductType;
import com.rajkamal.web.app.service.ServiceProductType;

@Service("serviceProductType")
@Transactional(rollbackOn = Exception.class)
public class ServiceProductTypeImpl implements ServiceProductType{
	
	@Autowired
	private DaoProductType daoProductType;

	public List<ProductType> getAllProductTypes() {
		return daoProductType.findAll();
	}

	public ProductType getProductTypeByName(String productTypeName) {
		return daoProductType.findByName(productTypeName);
	}

	public List<ProductType> getProductTypeNameLike(String productTypeNameLike) {
		return daoProductType.findByNameContaining(productTypeNameLike);
	}

}
