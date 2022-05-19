package com.example.greetingspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingSpringBootApplication.class, args);
        System.out.println("Welcome to Greeting Controller");
    }

}
