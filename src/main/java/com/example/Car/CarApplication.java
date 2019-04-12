package com.example.Car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {

		SpringApplication.run(CarApplication.class, args);
	}

}
