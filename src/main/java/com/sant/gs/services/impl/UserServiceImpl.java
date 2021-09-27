package com.sant.gs.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sant.gs.model.MessageResponse;
import com.sant.gs.entities.User;
import com.sant.gs.repository.UserRepository;
import com.sant.gs.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository ur;


	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	public MessageResponse addUser(User user) {
		// TODO Auto-generated method stub
		if(ur.existsByEmail(user.getEmail()))
		{
			return new MessageResponse(false,"Email déjà existant");
			
			
		}
		
			ur.save(user);
			return new MessageResponse(true,"Utilisateur ajouté avec succès");
			
		
		
	}

	public MessageResponse updateUser(User user) {
		// TODO Auto-generated method stub
	
		if(!(ur.existsByEmailAndId(user.getEmail(),user.getId())))
				
				{
					if(ur.existsByEmail(user.getEmail()))
					{
						return new MessageResponse(false,"Email déjà existant");
					}
			
				
					
				}

			ur.save(user);
			return new MessageResponse(true,"Utilisateur mis à jour avec succès");
		
			}

	public MessageResponse deleteUser(Integer id) {
		// TODO Auto-generated method stub
		
		if(ur.existsById(id))
		{
			ur.deleteById(id);
			return new MessageResponse(true,"Utilisateur supprimé avec succès");
			
		}
		else
		{
			return new MessageResponse(false,"identifiant inexistant");
		
		}
	
		
	
	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return ur.getById(id);
	}


}
