package com.sant.gs.services;

import java.util.List;

import com.sant.gs.entities.Ville;
import com.sant.gs.model.MessageResponse;

public interface VilleService {

	public List<Ville> getVilles();

	public MessageResponse addVille(Ville v);

	public MessageResponse updateVille(Ville v);

	public MessageResponse deleteVille(Integer id);

	public Ville getById(Integer id);


}
