package com.app.cafe.JWT;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig implements WebSecurityConfigurer{


	@Override
	public void configure(SecurityBuilder builder) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
