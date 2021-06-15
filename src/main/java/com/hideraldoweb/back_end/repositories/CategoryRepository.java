package com.hideraldoweb.back_end.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hideraldoweb.back_end.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
