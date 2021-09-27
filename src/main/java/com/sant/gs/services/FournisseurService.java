package com.sant.gs.services;

import com.sant.gs.model.MessageResponse;
import com.sant.gs.entities.Fournisseur;
import com.sant.gs.entities.Pharmacie;

import java.util.*;

public interface FournisseurService {

	public List<Fournisseur> getFournisseurs();


	public MessageResponse postFournisseur(Fournisseur f);


	public MessageResponse putFournisseur(Fournisseur f);


	public MessageResponse deleteFournisseur(Integer i);


	public Fournisseur getById(Integer id);
	

}
