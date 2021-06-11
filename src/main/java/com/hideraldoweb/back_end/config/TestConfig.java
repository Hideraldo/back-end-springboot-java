package com.hideraldoweb.back_end.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hideraldoweb.back_end.entities.User;
import com.hideraldoweb.back_end.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepositoy;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria da Dores", "mariadores@gmail.com", "98877-99999", "12345");
		User u2 = new User(null, "Arlindo Cruz", "arlindocruz@hotmail.com", "98888-88889", "12345");
		
		userRepositoy.saveAll(Arrays.asList(u1, u2));
		
	}
}
