package com.rajkamal.web.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajkamal.web.app.dao.DaoCompany;
import com.rajkamal.web.app.dto.view.DtoSearchSuggestionViewDto;
import com.rajkamal.web.app.enums.EnumSearcherType;
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

	public List<DtoSearchSuggestionViewDto> getSuggestionFor(String query) {
		List<DtoSearchSuggestionViewDto> dtos = new ArrayList<DtoSearchSuggestionViewDto>();
		List<Company> foundResultFor = this.getCompanyNameLike(query);
		if(foundResultFor!=null && foundResultFor.size()>0) {
			for(Company foCompany : foundResultFor) {
				DtoSearchSuggestionViewDto dto = new DtoSearchSuggestionViewDto();
				dto.setEnumSearcherType(EnumSearcherType.Company);
				dto.setResult(foCompany.getName());
				dtos.add(dto);
			}
		}
		return dtos;
	}

}
