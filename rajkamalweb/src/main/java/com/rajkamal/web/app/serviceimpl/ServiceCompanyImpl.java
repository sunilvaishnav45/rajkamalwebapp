package com.rajkamal.web.app.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rajkamal.web.app.service.ServiceCompany;

@Service("serviceCompany")
@Transactional(rollbackOn = Exception.class)
public class ServiceCompanyImpl implements ServiceCompany{

}
