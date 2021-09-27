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
import com.sant.gs.model.MessageResponse;
import com.sant.gs.services.FournisseurService;

@RestController
@RequestMapping("/fournisseur")
@CrossOrigin("http://localhost:4200/")
public class FournisseurController {

@Autowired
private FournisseurService fs;

@GetMapping
public List<Fournisseur> getFournisseurs(){
	return fs.getFournisseurs();
}
@GetMapping({"/id"})
public Fournisseur getById(@PathVariable("id") Integer id){
	return fs.getById(id);
}

@PostMapping
public MessageResponse postFournisseurs(@RequestBody Fournisseur f)
{
	return fs.postFournisseur(f);
}

@PutMapping
public MessageResponse putFournisseur(@RequestBody Fournisseur f)
{
	return fs.putFournisseur(f);
}

@DeleteMapping("/{id}")
public MessageResponse deleteFournisseur(@PathVariable("id") Integer i)
{
	return fs.deleteFournisseur(i);
}
}
