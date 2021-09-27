package com.sant.gs.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.ReactivePageableHandlerMethodArgumentResolver;
import org.springframework.stereotype.Service;

import com.sant.gs.entities.Region;
import com.sant.gs.model.MessageResponse;

import com.sant.gs.repository.RegionRepository;
import com.sant.gs.services.RegionService;

@Service
public class RegionServiceImpl implements RegionService{
	
	@Autowired
	private RegionRepository rer;
	
	
	@Override
	public List<Region> getRegion() {
		// TODO Auto-generated method stub
	return rer.findAll();
	}

	@Override
	public MessageResponse postRegion(Region rg) {
		if(rer.existsByNomAndVille(rg.getNom(),rg.getVille().getNom()))
			return new MessageResponse(false,"Region et ville existants");
		rer.save(rg);
		return new MessageResponse(true,"Region ajoutée avec succès");
		
	}

	@Override
	public MessageResponse putRegion(Region rg) {
		if(!(rer.existsByNomAndIdAndVille(rg.getNom(), rg.getId(),rg.getVille())))
		{
			if(rer.existsByNomAndVille(rg.getNom(),rg.getVille().getNom()))
				return new MessageResponse(false,"Region et ville existants");
			rer.save(rg);
			return new MessageResponse(true,"Région ajoutée avec succès");
		}
		rer.save(rg);
		return new MessageResponse(true,"Région ajoutée avec succès");
	}

	@Override
	public MessageResponse deleteRegion(Integer i) {
		
			if(rer.existsById(i))
			{
				rer.deleteById(i);
				return new MessageResponse(true,"Région supprimée avec succès");
			}
			return new MessageResponse(false,"Identificateur inexistant");
	}

	@Override
	public Region getById(Integer id) {
		// TODO Auto-generated method stub
		return rer.getById(id);	}
		
	}


