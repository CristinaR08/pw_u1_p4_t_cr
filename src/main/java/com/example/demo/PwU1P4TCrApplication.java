package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PwU1P4TCrApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PwU1P4TCrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto en casa");
		System.out.println("Cambio1");
		//Cambio2
		System.out.println("Cambio3");
	}

	
}
