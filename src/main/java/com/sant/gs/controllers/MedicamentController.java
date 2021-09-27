package com.sant.gs.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sant.gs.entities.Medicament;
import com.sant.gs.entities.Pharmacie;
import com.sant.gs.model.MessageResponse;
import com.sant.gs.services.MedicamentService;

@RestController
@RequestMapping("/medicament")
@CrossOrigin("http://localhost:4200/")
public class MedicamentController {

@Autowired
private MedicamentService ms;

@GetMapping
public List<Medicament> getMedica(){
	return ms.getMedica();
}

@RequestMapping(value="/{id}", method= RequestMethod.GET)
public Medicament getById(@PathVariable("id") Integer id){
	return ms.getById(id);
}

@PostMapping
public void postMedica(@RequestBody Medicament m) {
	
 ms.postMedica(m);
}

@PutMapping
public MessageResponse putMedica(@RequestBody Medicament m) {
	return ms.putMedica(m);
}

@DeleteMapping("/{id}")
public MessageResponse deleteMedica(@PathVariable("id")Integer i) {
	return ms.deleteMedica(i);
	
}






}


