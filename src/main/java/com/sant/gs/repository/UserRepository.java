package com.sant.gs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sant.gs.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	boolean findByEmail(User user);

	boolean existsByEmail(String string);

	boolean existsByEmailAndId(String email, Integer id);
	

}
