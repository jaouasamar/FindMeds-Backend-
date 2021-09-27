package com.sant.gs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sant.gs.entities.Fournisseur;
import com.sant.gs.entities.Pharmacie;
import com.sant.gs.entities.Region;
import com.sant.gs.model.MessageResponse;
import com.sant.gs.services.FournisseurService;
import com.sant.gs.services.RegionService;

@RestController
@RequestMapping("/region")
@CrossOrigin("http://localhost:4200/")
public class RegionController {

	@Autowired
	private RegionService rs;

	@GetMapping
	public List<Region> getRegion(){
		return rs.getRegion();
	}
	
	@GetMapping({"/id"})
	public Region getById(@PathVariable("id") Integer id){
		return rs.getById(id);
	}
	
	@PostMapping
	public MessageResponse postRegion(@RequestBody Region rg)
	{
		return rs.postRegion(rg);
	}

	@PutMapping
	public MessageResponse putRegion(@RequestBody Region rg)
	{
		return rs.putRegion(rg);
	}

	@DeleteMapping("/{id}")
	public MessageResponse deleteFournisseur(@PathVariable("id") Integer i)
	{
		return rs.deleteRegion(i);
	}

}
