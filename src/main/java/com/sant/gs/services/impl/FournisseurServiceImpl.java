package com.sant.gs.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sant.gs.entities.Fournisseur;
import com.sant.gs.entities.Pharmacie;
import com.sant.gs.model.MessageResponse;
import com.sant.gs.repository.FournisseurRepository;
import com.sant.gs.services.FournisseurService;

@Service
public class FournisseurServiceImpl implements FournisseurService{
	
	@Autowired
	FournisseurRepository fr;
	
	@Override
	public List<Fournisseur> getFournisseurs() {
		// TODO Auto-generated method stub
	
		return fr.findAll();
	}

	@Override
	public MessageResponse postFournisseur(Fournisseur f) {
	// TODO Auto-generated method stub
		
		if(!(fr.existsByEmail(f.getEmail()))&&(!(fr.existsByNom(f.getNom()))))
				{
					fr.save(f);
					return new MessageResponse(true,"Fournisseur ajouté avec succès");
					
					
				}
		else 
		 {
			 return new MessageResponse(false,"Nom ou Email du fournisseur existant");
			 
		}
		
		
		
	}
		 
	@Override
	public MessageResponse putFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
	
		if(!((fr.existsByEmail(f.getEmail()))&&(fr.existsById(f.getId())&&(fr.existsByNom(f.getNom())))))
			
		{
			if(fr.existsByEmail(f.getEmail()))
			{
			return new MessageResponse(false," Email du fournisseur existant");}
					
			else if(fr.existsByNom(f.getNom()))
		
			{return new MessageResponse(false," Nom du fournisseur existant");}
		
			
		
		}
		fr.save(f);
		return new MessageResponse(true,"Fournisseur mis à jour avec succès");
		}

	@Override
	public MessageResponse deleteFournisseur(Integer i) {
		// TODO Auto-generated method stub
	
		if (fr.existsById(i))
		{
			fr.deleteById(i);
			return new MessageResponse(true,"Fournisseur supprimé avec succès");
		
			
		}
		else
		{
			return new MessageResponse(false,"Identifiant inexistant,Echec de la suppression");
		
			
		}
	
	}

	@Override
	public Fournisseur getById(Integer id) {
		// TODO Auto-generated method stub
		return fr.getById(id);
	}

}
