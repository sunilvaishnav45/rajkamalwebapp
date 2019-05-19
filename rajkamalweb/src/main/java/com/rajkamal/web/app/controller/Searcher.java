package com.rajkamal.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajkamal.web.app.dto.view.DtoSearchSuggestionViewDto;
import com.rajkamal.web.app.service.ServiceCompany;
import com.rajkamal.web.app.service.ServiceProduct;
import com.rajkamal.web.app.service.ServiceProductType;

/**
 * To implement header search this Controller will be used
 * @author sunil
 *
 */
@RestController
@Controller
@RequestMapping("/search")
public class Searcher {
	
	@Autowired
	private ServiceCompany serviceCompany;
	
	@Autowired
	private ServiceProduct serviceProduct;

	@Autowired
	private ServiceProductType serviceProductType;
	/**
	 * TODO: Since front end is not developed yet  <br>
	 * For testing purpose sending @param in @PathVariable <br>
	 * Once front end will be developed will shift this into @RequestParam
	 * 
	 * This method search for
	 * 1.Product name
	 * 2.company name
	 * 3.Product Type name
	 * 
	 * Note : In future requirement comes for to implement by color we can do that too here.
	 */
	@GetMapping(value = "/{query}")
	public List<DtoSearchSuggestionViewDto> getSuggestionFor(@PathVariable("query") String query){
		List<DtoSearchSuggestionViewDto> dtos = new ArrayList<DtoSearchSuggestionViewDto>();
		
		//To get all the companies for query
		List<DtoSearchSuggestionViewDto> companies = serviceCompany.getSuggestionFor(query);
		
		//To get all the products for query
		List<DtoSearchSuggestionViewDto> products = serviceProduct.getSuggestionFor(query);
		
		//To get all the product type for query
		List<DtoSearchSuggestionViewDto> productTypes = serviceProductType.getSuggestionFor(query);
		
		if(companies!=null && companies.size()>0) dtos.addAll(companies); 
		if(products!=null && products.size()>0) dtos.addAll(products); 
		if(productTypes!=null && productTypes.size()>0) dtos.addAll(productTypes); 
		
		return dtos;
	}

}
