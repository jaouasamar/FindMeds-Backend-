package com.sant.gs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sant.gs.entities.Pharmacie;
import com.sant.gs.model.MessageResponse;

public interface pharmacieRepository extends JpaRepository<Pharmacie,Integer>
{

	boolean findByNom(String nom);

	boolean existsByNom(String nom);

	boolean existsByNomAndId(String nom, Integer id);


	

}
