package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.user.repository.UsersRepository;
import com.example.demo.user.vo.User;

@RestController
public class UserController {
	
	@Autowired
	UsersRepository usersRepository;
	
	@RequestMapping(value ="/user/getAll",method=RequestMethod.GET)
	public Optional<User> findAllUsers(){
		Optional<User> user = usersRepository.findById(0);
		return user;
	}

}

















































































