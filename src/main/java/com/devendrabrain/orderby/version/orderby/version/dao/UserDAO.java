package com.devendrabrain.orderby.version.orderby.version.dao;

import java.util.List;

import com.devendrabrain.orderby.version.orderby.version.entity.User;

public interface UserDAO {

	public User save(User user);

	public List<User> findAll();
}
