package com.devendrabrain.orderby.version.orderby.version.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devendrabrain.orderby.version.orderby.version.entity.User;
import com.devendrabrain.orderby.version.orderby.version.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save/user")
	public User saveUser(@RequestBody User user) {

		return userService.save(user);
	}

	@GetMapping("/findAll")
	public List<User> findAll() {

		return userService.findAll();
	}
}
