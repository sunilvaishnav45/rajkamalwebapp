package com.rajkamal.web.app.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajkamal.web.app.dao.DaoColor;
import com.rajkamal.web.app.mapping.Color;
import com.rajkamal.web.app.service.ServiceColor;

@Service("serviceColor")
@Transactional(rollbackOn = Exception.class)
public class ServiceColorImpl implements ServiceColor{
	
	@Autowired
	private DaoColor daoColor;

	public List<Color> getAllColors() {
		return daoColor.findAll();
	}

	public Color getColorByName(String name) {
		return daoColor.findByName(name);
	}
	
}
