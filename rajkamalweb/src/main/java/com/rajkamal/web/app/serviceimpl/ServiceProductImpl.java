package com.rajkamal.web.app.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rajkamal.web.app.service.ServiceProduct;

@Service("serviceProduct")
@Transactional(rollbackOn = Exception.class)
public class ServiceProductImpl implements ServiceProduct{

}
