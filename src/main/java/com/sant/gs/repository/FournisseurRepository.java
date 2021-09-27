package com.sant.gs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sant.gs.entities.Fournisseur;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer>{

	boolean findByEmail(String email);

	boolean findByNom(String nom);

	boolean existsByEmail(String email);

	boolean existsByNom(String nom);

}
