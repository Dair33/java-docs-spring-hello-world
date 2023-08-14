package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mdbspringboot.model.GroceryItem;
import com.example.mdbspringboot.model.ItemRepository;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;


@SpringBootApplication 
@EnableMongoRepositories
@RestController
public class MdbSpringBootApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MdbSpringBootApplication.class);
      
    @Autowired
    ItemRepository groceryItemRepo;
    
    public static void main(String[] args) {
        SpringApplication.run(MdbSpringBootApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        // Logic to be run on application start, for example:
         groceryItemRepo.save(new GroceryItem("10", "Apple", 10, "Fruits"));
    }
    @RequestMapping("/hello")
    String sayHello() {
        logger.info("This is a test log to make sure this works");
        return "Hello World this is an update number 3 hopefully with working react ADADASDASDASD";
    }

    @PostMapping("/name")
    public void postName(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        //groceryItemRepo.save(new GroceryItem("1", name, 10, "Fruits"));
        logger.info("Received me {}", name);
    }
}
