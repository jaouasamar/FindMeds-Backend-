package com.sant.gs.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private	String nom;
	private String prenom;
	private String dateNaissance;
	private String email;
	@JoinColumn
	@ManyToOne
	private Ville ville;
	private String adresse;
	private Region delegation;
	private String role;/*admin_farmacie-fournisseur*/
	
	public Integer getId() {
		return id;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	public Region getDelegation() {
		return delegation;
	}
	public void setDelegation(Region delegation) {
		this.delegation = delegation;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Ville getAdresse() {
		return ville;
	}
	public void setAdresse(Ville ville) {
		this.ville = ville;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	


}
