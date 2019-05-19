package com.rajkamal.web.app.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rajkamal.web.app.service.ServiceProductColorMapping;

@Service("serviceProductColorMapping")
@Transactional(rollbackOn = Exception.class)
public class ServiceProductColorMappingImpl implements ServiceProductColorMapping{

}
