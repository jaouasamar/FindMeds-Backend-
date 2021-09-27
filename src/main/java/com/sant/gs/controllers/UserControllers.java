package com.sant.gs.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sant.gs.entities.Pharmacie;
import com.sant.gs.entities.User;
import com.sant.gs.model.MessageResponse;
import com.sant.gs.services.UserService;
import com.sant.gs.services.impl.UserServiceImpl;


@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200/")

public class UserControllers {
	
@Autowired
private UserService us;

@GetMapping
public List<User> getUsers(){
	return us.getUsers();
}

@GetMapping({"/id"})
public User getById(@PathVariable("id") Integer id){
	return us.getById(id);
}
	
@PostMapping
public MessageResponse addUser(@RequestBody User user) {
	return us.addUser(user);
}

@PutMapping
public MessageResponse updateUser(@RequestBody User user) {
	return us.updateUser(user);
}

@DeleteMapping("/{id}")
public MessageResponse deleteUser(@PathVariable("id") Integer id)
{
return us.deleteUser(id);
}
}
