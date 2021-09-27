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

import com.sant.gs.entities.Pharmacie;
import com.sant.gs.model.MessageResponse;
import com.sant.gs.services.PharmacieService;

@RestController
@RequestMapping("/pharmacie")
@CrossOrigin("http://localhost:4200/")
public class PharmacieController {

	@Autowired
	private PharmacieService fs;

	@GetMapping
	public List<Pharmacie> getPharmacies(){
		return fs.getAll();
	}
	
	@GetMapping({"/id"})
	public Pharmacie getById(@PathVariable("id") Integer id){
		return fs.getById(id);
	}
	
	@PostMapping
	public void postPharmacie(@RequestBody Pharmacie f) {
		
		fs.postPharmacie(f);
		
	}

	@PutMapping
	public MessageResponse putPharmacie(@RequestBody Pharmacie f) {
		return fs.putPharmacie(f);
	}

	@DeleteMapping ("/{id}")
	public MessageResponse deletePharmacie(@PathVariable("id") Integer i) {
		return fs.deletePharmacie(i);

}
}
