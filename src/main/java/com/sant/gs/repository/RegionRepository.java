package com.sant.gs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sant.gs.entities.Region;
import com.sant.gs.entities.Ville;

@Repository
public interface RegionRepository extends JpaRepository<Region,Integer>{

	boolean existsByNomAndVille(String nom, String string);

	boolean existsByNomAndIdAndVille(String nom, Integer id,Ville ville);

	

}
