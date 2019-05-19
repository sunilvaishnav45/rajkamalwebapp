package com.rajkamal.web.app.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rajkamal.web.app.service.ServiceColor;

@Service("serviceColor")
@Transactional(rollbackOn = Exception.class)
public class ServiceColorImpl implements ServiceColor{

}
