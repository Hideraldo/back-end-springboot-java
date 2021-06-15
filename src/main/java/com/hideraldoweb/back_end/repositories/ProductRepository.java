package com.hideraldoweb.back_end.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hideraldoweb.back_end.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
