package com.sg.training.circuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CircuitbreakerResilience4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitbreakerResilience4jApplication.class, args);
	}

}
