package com.sant.gs.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.sant.gs.model.MessageResponse;

@Entity
public class Medicament implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private Integer prix;
	private Integer quantite;
	private String type_de_maladies;
	private String tranches_de_age;
	@OneToOne
	@JoinColumn
	private Pharmacie pharmacie;
	@ManyToMany
	@JoinColumn
	private List<Fournisseur> fournisseur;
	
	public String getType_de_maladies() {
		return type_de_maladies;
	}
	
	public Pharmacie getPharmacie() {
		return pharmacie;
	}
	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}
	public void setType_de_maladies(String type_de_maladies) {
		this.type_de_maladies = type_de_maladies;
	}
	public String getTranches_de_age() {
		return tranches_de_age;
	}
	public void setTranches_de_age(String tranches_de_age) {
		this.tranches_de_age = tranches_de_age;
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
	public Integer getPrix() {
		return prix;
	}
	public void setPrix(Integer prix) {
		this.prix = prix;
	}
	public Integer getQuantité() {
		return quantite;
	}
	public void setQuantité(Integer quantite) {
		this.quantite = quantite;
	}
	
	
	

}
