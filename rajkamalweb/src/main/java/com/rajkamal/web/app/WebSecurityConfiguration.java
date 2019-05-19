package com.rajkamal.web.app;

import javax.sql.DataSource;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Spring securities <br>
 * 
 * @author sunil
 *
 */
@EnableWebSecurity
@Configuration
public class WebSecurityConfiguration  extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource dataSource;
	
	private static final Logger log = Logger.getLogger(WebSecurityConfiguration.class);
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource).authoritiesByUsernameQuery(
				"SELECT u.email AS username,r.role AS role FROM user as u LEFT OUTER JOIN user_role_mapping as ur ON u.id = ur.user_id LEFT OUTER JOIN role as r ON r.id = ur.role_id where u.email=?")
		.usersByUsernameQuery("SELECT u.email AS username,u.password AS password,u.enabled as enabled FROM user as u  LEFT OUTER JOIN user_role_mapping as ur ON u.id = ur.user_id LEFT OUTER JOIN role as r ON r.id = ur.role_id where u.email=?");
	}
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Bean
	CrosOriginConfig crosOriginConfig() {
		CrosOriginConfig crosOriginConfig = new CrosOriginConfig();
		return crosOriginConfig;
	}
	
	@Override
	protected void configure(HttpSecurity  httpSecurity) throws Exception {
		httpSecurity
        .csrf().disable()
        .anonymous().disable()
        .authorizeRequests()
        .antMatchers("/resources/**").permitAll();
		
	}
}
