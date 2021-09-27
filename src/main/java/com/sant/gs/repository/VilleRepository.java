package com.sant.gs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sant.gs.entities.Ville;

@Repository
public interface VilleRepository extends JpaRepository<Ville,Integer>{

	public boolean findByNom(String string);

	public boolean existsByNom(String nom);

	public boolean existsByNomAndId(String nom, Integer id);
	

}
