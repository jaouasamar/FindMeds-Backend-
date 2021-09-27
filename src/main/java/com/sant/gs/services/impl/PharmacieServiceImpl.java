package com.sant.gs.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sant.gs.entities.Pharmacie;
import com.sant.gs.model.MessageResponse;
import com.sant.gs.repository.pharmacieRepository;
import com.sant.gs.services.PharmacieService;

@Service
public class PharmacieServiceImpl implements PharmacieService {
	
	@Autowired
	private pharmacieRepository fr;
	

	@Override
	public List<Pharmacie> getAll() {
		// TODO Auto-generated me
		return fr.findAll();
	}

	@Override
	public MessageResponse postPharmacie(Pharmacie f) {
		// TODO Auto-generated method stub
		
		if(fr.existsByNom(f.getNom()))
		{
			return new MessageResponse(false,"pharmacie déjà existante");
						
		}
			fr.save(f);
			return new MessageResponse(true,"pharmacie ajoutée avec succès");
	
		}

	@Override
	public MessageResponse putPharmacie(Pharmacie f) {
		// TODO Auto-generated method stub
		
		if(!(fr.existsByNomAndId(f.getNom(),f.getId())))
		{
			if(fr.existsByNom(f.getNom()))
			{return new MessageResponse(false,"pharmacie existante");}
			
		}
		fr.save(f);
		return new MessageResponse (true,"pharmacie mise à jour avec succès");
	
		}

	@Override
	public MessageResponse deletePharmacie(Integer i) {
		// TODO Auto-generated method stub
		
		if(fr.existsById(i))
		{
			fr.deleteById(i);
			return new MessageResponse(true,"Pharmacie supprimée avec succès");
			
		}
		else
		{
			return new MessageResponse(false,"Echec de la suppression");
			
		}
	
		
	}
	
	public Pharmacie getById(Integer i) {
		
		return fr.getById(i);
		
		
		
	}
	

	
	
	

}
