package com.sg.training.os;

import com.sg.training.os.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(DemoApplication.class, args);

		log.info("DemoApplication started...");

		CartService cartService = applicationContext.getBean(CartService.class);
        log.info("Order details are [{}]..", cartService.getOrderInfo());
	}

}
