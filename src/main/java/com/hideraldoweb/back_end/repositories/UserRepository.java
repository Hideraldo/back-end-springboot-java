package com.hideraldoweb.back_end.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hideraldoweb.back_end.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
