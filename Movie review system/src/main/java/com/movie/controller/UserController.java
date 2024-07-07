package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entities.User;
import com.movie.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
@Autowired
private UserService userService;

@PostMapping
public User addNewUser(@RequestBody User user) {
	return userService.addNewUser(user);
}






}