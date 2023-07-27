package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	// @Test
	// void contextLoads() {
	// }
	
	@PostMapping("/name")
public String createUser(@RequestBody String name) {
  
	
		return name;

}



}
