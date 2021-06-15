package com.hideraldoweb.back_end.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hideraldoweb.back_end.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
