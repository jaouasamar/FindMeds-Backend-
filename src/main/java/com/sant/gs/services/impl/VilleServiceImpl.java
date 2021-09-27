package com.sant.gs.services.impl;

import java.util.List;
import java.lang.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sant.gs.entities.Ville;
import com.sant.gs.model.MessageResponse;
import com.sant.gs.repository.UserRepository;
import com.sant.gs.repository.VilleRepository;
import com.sant.gs.services.VilleService;

@Service
public class VilleServiceImpl implements VilleService {
	
	@Autowired
	private VilleRepository vr;
	MessageResponse messr= new MessageResponse();

	@Override
	public List<Ville> getVilles() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}


	@Override
	public MessageResponse addVille(Ville v) {
		if(vr.existsByNom(v.getNom()))
		{
			return new MessageResponse(false,"Ville déjà existante");
		}
		else
		{
			vr.save(v);
			return new MessageResponse(true,"Ville ajoutée avec succès");
		
		}
	
	
	}

	@Override
	public MessageResponse updateVille(Ville v) {
		// TODO Auto-generated method stub
		if(!(vr.existsByNomAndId(v.getNom(),v.getId())))
		{
			if(vr.existsByNom(v.getNom()))
			{
				return new MessageResponse(false,"Ville déjà existante");
			}
			
			
		}
		vr.save(v);
		return new MessageResponse(true,"Ville mise à jour avec succès");
	
			}

	@Override
	public MessageResponse deleteVille(Integer i) {
		// TODO Auto-generated method stub
		if(!(vr.existsById(i)))
		{
			return new MessageResponse(false,"identifiant inexistant");
		
			
		}
		vr.deleteById(i);
		return new MessageResponse(true,"Ville supprimée avec succès");
			
		}


	@Override
	public Ville getById(Integer id) {
		// TODO Auto-generated method stub
		return vr.getById(id);
	}
	}
