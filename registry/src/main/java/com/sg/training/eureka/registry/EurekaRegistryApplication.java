package com.sg.training.eureka.registry;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaRegistryApplication {

	private static final Logger log = LoggerFactory.getLogger(EurekaRegistryApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegistryApplication.class, args);
		log.info("Eureka Server started...");
	}

}
