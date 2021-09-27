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

import com.sant.gs.entities.Region;
import com.sant.gs.entities.Ville;
import com.sant.gs.model.MessageResponse;
import com.sant.gs.services.VilleService;

@RestController
@RequestMapping("/ville")
@CrossOrigin("http://localhost:4200/")

public class VilleController {

@Autowired
private VilleService vs;

@GetMapping
public List<Ville> getVilles(){
	return vs.getVilles();

}
@GetMapping({"/id"})
public Ville getById(@PathVariable("id") Integer id){
	return vs.getById(id);
}


@PostMapping
 public MessageResponse addVille(@RequestBody Ville v) {
 return vs.addVille(v);
}

@PutMapping
public MessageResponse updateVille(@RequestBody Ville v) {
	return vs.updateVille(v);
}

@DeleteMapping("/{id}")
public MessageResponse deleteVille(@PathVariable("id") Integer id) {
	return vs.deleteVille(id);
}





}
