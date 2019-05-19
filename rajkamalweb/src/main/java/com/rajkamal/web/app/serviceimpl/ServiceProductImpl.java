package com.rajkamal.web.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajkamal.web.app.dao.DaoProduct;
import com.rajkamal.web.app.dto.view.DtoSearchSuggestionViewDto;
import com.rajkamal.web.app.enums.EnumSearcherType;
import com.rajkamal.web.app.mapping.Product;
import com.rajkamal.web.app.service.ServiceProduct;

@Service("serviceProduct")
@Transactional(rollbackOn = Exception.class)
public class ServiceProductImpl implements ServiceProduct{
	
	@Autowired
	private DaoProduct daoProduct;

	public List<Product> getAllProducts() {
		return daoProduct.findAll();
	}

	public Product getProductByName(String productName) {
		return daoProduct.findByName(productName);
	}

	public List<Product> getProductNameLike(String productNameLike) {
		return daoProduct.findByNameContaining(productNameLike);
	}

	public List<DtoSearchSuggestionViewDto> getSuggestionFor(String query) {
		List<DtoSearchSuggestionViewDto> dtos = new ArrayList<DtoSearchSuggestionViewDto>();
		List<Product> foundResultFor = this.getProductNameLike(query);
		if(foundResultFor!=null && foundResultFor.size()>0) {
			for(Product foProduct : foundResultFor) {
				DtoSearchSuggestionViewDto dto = new DtoSearchSuggestionViewDto();
				dto.setEnumSearcherType(EnumSearcherType.Product);
				dto.setResult(foProduct.getName());
				dtos.add(dto);
			}
		}
		return dtos;
	}
}
