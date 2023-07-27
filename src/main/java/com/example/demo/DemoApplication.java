package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
@RestController
public class DemoApplication {
	 private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}

	@RequestMapping("/")
	String sayHello() {
        logger.info("This is a test log to make sure this works");
		return "Hello World this is an update number 3 hopefully with working react ADADASDASDASD";
	
	}
}
