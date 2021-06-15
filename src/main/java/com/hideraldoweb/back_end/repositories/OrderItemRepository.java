package com.hideraldoweb.back_end.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hideraldoweb.back_end.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
