package com.curso.sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.sts.entities.OrderItem;

//não precisa do @repository pois ja extende(herda) ao repo do jpa
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
}
