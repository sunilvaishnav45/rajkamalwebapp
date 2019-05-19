package com.rajkamal.web.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajkamal.web.app.mapping.Color;

@Repository
public interface DaoColor extends JpaRepository<Color, Integer>{

}
