package com.rajkamal.web.app.service;

import java.util.List;

import com.rajkamal.web.app.dto.view.DtoSearchSuggestionViewDto;
import com.rajkamal.web.app.mapping.Company;

public interface ServiceCompany {
	
	/**
	 * Will be used to fetch all the companies
	 * @return
	 */
	public List<Company> getAllCompnies();
	
	/**
	 * Get company by name
	 * @param companyName
	 * @return
	 */
	public Company getCompanyByName(String companyName);
	
	/**
	 * Fetch all companies names matched with @param companyNameLike
	 * @param companyName
	 * @return
	 */
	public List<Company> getCompanyNameLike(String companyNameLike);
	
	/**
	 * This method will return all possible result found for Companies by name
	 * @param query
	 * @return
	 */
	public List<DtoSearchSuggestionViewDto> getSuggestionFor(String query);

}
