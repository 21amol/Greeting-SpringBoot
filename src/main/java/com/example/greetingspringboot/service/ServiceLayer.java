package com.example.greetingspringboot.service;

import com.example.greetingspringboot.model.User;
import com.example.greetingspringboot.repository.SpringRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceLayer {

    @Autowired
    SpringRepo springRepository;

    public String sayHello() {
        return "Hello World!!!";

    }


    public User sayPostHello(User user) {
        User newUser = new User(user);
        springRepository.save(newUser);
        return newUser;
        //   return "Hello Greetings to Mr. "+user.getFirstName() +" "+ user.getLastName() + "!!!";
    }

    public Optional<User> showById(int id) {
        return springRepository.findById(id);
    }

    public List<User> showAll() {
        return springRepository.findAll();
    }
}
