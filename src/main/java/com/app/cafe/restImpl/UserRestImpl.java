package com.app.cafe.restImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.app.cafe.constants.CafeConstants;
import com.app.cafe.rest.UserRest;
import com.app.cafe.serviceImpl.UserServiceImpl;
import com.app.cafe.utils.CafeUtils;

@RestController
public class UserRestImpl implements UserRest{

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Override
	public ResponseEntity<String> signUp(Map<String, String> requestMap) {
		try {
			return userServiceImpl.signUp(requestMap);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	
}
}