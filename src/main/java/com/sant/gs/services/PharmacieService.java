package com.sant.gs.services;

import java.util.List;
import com.sant.gs.entities.Pharmacie;
import com.sant.gs.model.MessageResponse;

public interface PharmacieService {

	public List <Pharmacie> getAll();

	public MessageResponse postPharmacie(Pharmacie f);

	public MessageResponse putPharmacie(Pharmacie f);

	public MessageResponse deletePharmacie(Integer i);
	
	public Pharmacie getById(Integer i);
	
	
	
	



	
	

}
