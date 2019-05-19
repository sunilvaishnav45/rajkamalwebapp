package com.rajkamal.web.app.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rajkamal.web.app.service.ServiceUser;

@Service
@Transactional(rollbackOn = Exception.class)
public class ServiceUserImpl implements ServiceUser{

}
