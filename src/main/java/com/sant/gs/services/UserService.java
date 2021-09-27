package com.sant.gs.services;

import java.util.List;

import com.sant.gs.entities.Pharmacie;
import com.sant.gs.entities.User;
import com.sant.gs.model.MessageResponse;

public interface UserService {
	public List<User> getUsers();
	public MessageResponse addUser(User user) ;
	public MessageResponse updateUser(User user);
	public MessageResponse deleteUser(Integer id);
	public User getById(Integer id);
}
