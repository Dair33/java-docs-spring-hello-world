package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import java.util.Map;


@SpringBootApplication
@RestController
public class DemoApplication {
	 private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		 System.setProperty("AZURE_CLIENT_ID", "39eacea3-2a44-42c6-8292-19b931ee9559");
        System.setProperty("AZURE_CLIENT_SECRET", "Rdb8Q~vvVTIM6BQaFjxrLfUGrLeFH0f3HwC_Hddf");
        System.setProperty("AZURE_TENANT_ID", "62e43eb0-3ee1-441e-aada-1499b16d95e2");

		SpringApplication.run(DemoApplication.class, args);

	}

	@RequestMapping("/name")
	void sayHello() {
        logger.info("This is a test log to make sure this works");
		//return "Hello World this is an update number 3 hopefully with working react ADADASDASDASD";
	
	}
	@PostMapping("/name")
    public void postName(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        logger.info("Received me {}", name);
    }
}
// in application .properties must use 12.2 therefore authentication mode is correct