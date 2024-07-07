package com.movie.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.entities.User;
import com.movie.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
@Autowired
private UserRepository userRepository;


public User addNewUser(User user) {
	
	return userRepository.save(user);
}





}
