package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	// @Test
	// void contextLoads() {
	// }
	  private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@PostMapping("/name")
public String createUser(@RequestBody String name) {
    // code to create a user
	    logger.info("Creating user with name: {}", name);
		return name;

}



}
