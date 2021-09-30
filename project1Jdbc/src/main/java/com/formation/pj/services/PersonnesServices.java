package com.formation.pj.services;

import java.sql.SQLException;
import java.util.List;

import com.formation.pj.entity.Personnes;
import com.formation.pj.utils.MessageRes;



public interface PersonnesServices {
	
	public MessageRes save(Personnes pers) throws ClassNotFoundException, SQLException;
	public List<Personnes>findAll() throws ClassNotFoundException, SQLException;
	public Personnes findById(int id) throws ClassNotFoundException, SQLException ;
	public List<Personnes> findByNom(String nom) throws SQLException, ClassNotFoundException;
	public List<Personnes> findByPrenom(String prenom) throws ClassNotFoundException, SQLException;
	public Personnes findByMail(String mail) throws ClassNotFoundException, SQLException;
	public  MessageRes deletePersonneById(int i) throws ClassNotFoundException, SQLException ;
	public  MessageRes deletePersonneByNom(String nom1) throws ClassNotFoundException, SQLException;
	public  MessageRes deletePersonneByByPrenom(String prenom1) throws ClassNotFoundException, SQLException ;
	public  MessageRes deletePersonneByMail(String  mail) throws ClassNotFoundException, SQLException ;
	public MessageRes updatePersonne(Personnes personne) throws ClassNotFoundException, SQLException;
	
	

}