package com.curso.sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.sts.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
