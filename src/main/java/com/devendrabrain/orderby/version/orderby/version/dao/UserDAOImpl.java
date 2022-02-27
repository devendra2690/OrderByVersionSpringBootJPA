package com.devendrabrain.orderby.version.orderby.version.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.devendrabrain.orderby.version.orderby.version.entity.User;
import com.devendrabrain.orderby.version.orderby.version.repository.UserRepository;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User save(User user) {
		
		try {
			return userRepository.save(user);
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
