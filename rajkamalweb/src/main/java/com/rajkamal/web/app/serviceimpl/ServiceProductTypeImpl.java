package com.rajkamal.web.app.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rajkamal.web.app.service.ServiceProductType;

@Service("serviceProductType")
@Transactional(rollbackOn = Exception.class)
public class ServiceProductTypeImpl implements ServiceProductType{

}
