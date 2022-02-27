package com.devendrabrain.orderby.version.orderby.version.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devendrabrain.orderby.version.orderby.version.dao.UserDAO;
import com.devendrabrain.orderby.version.orderby.version.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	@Override
	public User save(User user) {
		return userDAO.save(user);
	}

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

}
