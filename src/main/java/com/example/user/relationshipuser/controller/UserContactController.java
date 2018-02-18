package com.example.user.relationshipuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.relationshipuser.entity.UserContact;
import com.example.user.relationshipuser.repository.UserContactRepository;

@RestController
public class UserContactController  {

	@Autowired
	UserContactRepository repos;
	
	@GetMapping(value="/user/all")
	public List<UserContact> getAll(){
		System.out.println("Inside controller");
		return repos.findAll();
	}
}
