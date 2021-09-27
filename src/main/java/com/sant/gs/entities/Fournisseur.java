package com.sant.gs.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur  implements Serializable{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String adresse;
	private String email;
	@ManyToOne
	@JoinColumn
	private Ville ville;
	@ManyToMany
	@JoinColumn
	private List<Medicament> medicaments;
	@ManyToMany
	@JoinColumn
	private List<Pharmacie> pharmacie;
	
	
	public List<Pharmacie> getPharmacie() {
		return pharmacie;
	}
	public void setPharmacie(List<Pharmacie> pharmacie) {
		this.pharmacie = pharmacie;
	}
	public Integer getId() {
		return id;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	public List<Medicament> getMedicaments() {
		return medicaments;
	}
	public void setMedicaments(List<Medicament> medicaments) {
		this.medicaments = medicaments;
	}
	
	
	
	
}
