package com.app.cafe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.app.cafe.POJO.User;

public interface UserDao extends JpaRepository<User, Integer>{

	User findByEmailId(@Param("email") String email);
}
