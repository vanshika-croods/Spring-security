package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringScApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringScApplication.class, args);
		String password = "uv";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		System.out.println("===========================================");
		System.out.println(hashedPassword);
		System.out.println("===========================================");
	}

}
