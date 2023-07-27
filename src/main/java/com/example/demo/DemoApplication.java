package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
  private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/name")
public String createUser(@RequestBody String name) {
    // code to create a user
	    logger.info("Creating user with name: {}", name);
		return name;

}
}
