package com.example.greetingspringboot.service;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
    public String sayHello() {
        return "Hello World!!!";
    }
}
