package com.sant.gs.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sant.gs.entities.Medicament;

@Repository
public interface MedicamentRepository extends JpaRepository<Medicament,Integer>{

	public List<Medicament> findAll();

	public boolean findByNom(String string);

	public boolean existsByNom(String nom);

	public boolean existsByNomAndId(String nom, Integer id);
	
	public Optional<Medicament> findById(Integer id);
	

		 

	
	

}
