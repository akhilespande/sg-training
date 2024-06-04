package com.sg.training.article;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class ArticleApplication {

	private static final Logger log = LoggerFactory.getLogger(ArticleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ArticleApplication.class, args);
		log.info("ArticleApplication started ... ");
	}

}
