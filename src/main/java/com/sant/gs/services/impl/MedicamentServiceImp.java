package com.sant.gs.services.impl;
import java.io.Console;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sant.gs.entities.Medicament;
import com.sant.gs.model.MessageResponse;
import com.sant.gs.repository.MedicamentRepository;
import com.sant.gs.services.*;

@Service
public class MedicamentServiceImp implements MedicamentService{
	
	@Autowired
	private MedicamentRepository mr;

	@Override
	public List<Medicament> getMedica() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

	
	@Override
	public MessageResponse postMedica(Medicament m) {
		// TODO Auto-generated method stub
		
		if(mr.existsByNom(m.getNom()))
		{
		
			return new MessageResponse(false,"Medicament existant");
		
		}
		
		
			mr.save(m);
			return new MessageResponse(true,"Medicament ajouté avec succès");
			
		
			
	}				
		

	@Override
	public MessageResponse putMedica(Medicament m) {
		// TODO Auto-generated method stub
		
		if(!(mr.existsByNomAndId(m.getNom(),m.getId())))
		{
			mr.save(m);
			return new MessageResponse(true,"Medicament mis à jour avec succès");
			
		}
		if(mr.existsByNom(m.getNom()))
		{
		return new MessageResponse(false,"Medicament existant");
		}
		return null;
		}

	@Override
	public MessageResponse deleteMedica(Integer i) {
		// TODO Auto-generated method stub
		
		if(mr.existsById(i))
		{
			mr.deleteById(i);
			return new MessageResponse(true,"Medicament supprimé avec succès");
			
		}
		
			return new MessageResponse(false,"Identifiant non trouvé");
			
		
	
	}


	@Override
	public Medicament getById(Integer id) {
		// TODO Auto-generated method stub
		
		return mr.findById(id).get();
	}
};
