package com.udemy.rest.webservices.restful_web_services.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService userDaoService;
	
	public UserResource (UserDaoService userDaoService) {
		this.userDaoService = userDaoService;
	}
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return userDaoService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable Integer id) {
		return userDaoService.findUserById(id);
	}
}
