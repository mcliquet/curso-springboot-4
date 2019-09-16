package com.curso.sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.sts.entities.Category;

//não precisa do @repository pois ja extende(herda) ao repo do jpa
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
