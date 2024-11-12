package com.app.cafe.JWT;

import java.util.ArrayList;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.cafe.dao.UserDao;

import lombok.extern.java.Log;

@Service
public class CustomerUsersDetailsService implements UserDetailsService{

	private static final Logger log = LoggerFactory.getLogger(CustomerUsersDetailsService.class);
	
	@Autowired
	private UserDao userDao;
	
	private com.app.cafe.POJO.User userDetails;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("Inside loadUserByUsername {}", username);
		userDetails = userDao.findByEmailId(username);
		if(!Objects.isNull(userDetails))
			return new User(userDetails.getEmail(), userDetails.getPassword(), new ArrayList<>());
		else
			throw new UsernameNotFoundException("User not found");
	}
	
	public com.app.cafe.POJO.User getUserDetail() {
		return userDetails;
	}

}
