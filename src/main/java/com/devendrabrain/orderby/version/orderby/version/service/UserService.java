package com.devendrabrain.orderby.version.orderby.version.service;

import java.util.List;

import com.devendrabrain.orderby.version.orderby.version.entity.User;

public interface UserService {

	public User save(User user);
	public List<User> findAll();
}
