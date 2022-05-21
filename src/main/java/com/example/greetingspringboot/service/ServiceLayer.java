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

    public User edit(int id, User user) {

        User getUser = springRepository.getById(id);
        getUser.setFirstName(user.getFirstName());
        getUser.setLastName(user.getLastName());

        User updateUser;
        updateUser = springRepository.save(getUser);
        return updateUser;
    }

    public String delete(int id) {
        Optional<User> newUser = springRepository.findById(id);
        if (newUser.isPresent()) {
            springRepository.delete(newUser.get());
            return "Deleted record with id number: " + id;
        } else {
            return "Record not Found";
        }
    }
}
