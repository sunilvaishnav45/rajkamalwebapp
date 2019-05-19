package com.rajkamal.web.app;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class CrosOriginConfig implements Filter{

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {HttpServletResponse response = (HttpServletResponse) servletResponse;
			response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	        response.setHeader("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS");
	        response.setHeader("Access-Control-Allow-Headers", "*");
	        response.setHeader("Access-Control-Allow-Credentials", "true");
	        filterChain.doFilter(servletRequest, servletResponse);
	 }

}
