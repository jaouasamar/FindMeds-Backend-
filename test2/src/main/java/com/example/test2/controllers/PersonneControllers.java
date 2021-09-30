package com.example.test2.controllers;

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

import com.example.test2.entities.Personne;
import com.example.test2.services.PersonnesServices;

@RestController
@RequestMapping("/personne")

@CrossOrigin("http://localhost:4200/")
public class PersonneControllers {
	
@Autowired
private PersonnesServices s ;

@GetMapping
public List<Personne> findAll(){
	return s.getAll();
}

@PostMapping
public Boolean insert(@RequestBody Personne n  )
{
return s.save(n);

}

@PutMapping
public Boolean update(@RequestBody Personne n )
{
return s.update(n);

}

@DeleteMapping("/{id}")
public Boolean delete(@PathVariable("id") Integer i)
{
return s.delete(i);

}


@GetMapping("/{id}")
public Personne findById(@PathVariable("id") Integer i)
{
	return s.getById(i);
}

@GetMapping("/email/{email}")
public Personne findByEmail(@PathVariable("email") String mail)
{
	return s.getByMail(mail);
}



}