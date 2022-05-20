package com.example.greetingspringboot.controller;

import com.example.greetingspringboot.model.User;
import com.example.greetingspringboot.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Hello")
public class GreetingController {


    @Autowired
    ServiceLayer serviceLayer;

    @GetMapping("/ser")                           //UC-2
    public String sayHelloService() {
        String response;
        response = serviceLayer.sayHello();
        return response;
    }

    @RequestMapping(value = {"", "/Home"})
    public String sayHello() {
        return "Hello, I am Amol!!!";
    }

    @RequestMapping(value = {"/hello-w"}, method = RequestMethod.GET)
    public String sayHelloDifferently() {
        return "Hello Everyone, its me Amol!!!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!!!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + "Mr." + name + "!!!";
    }

//    @PostMapping("/post")
//    public String sayHello(@RequestBody User user) {
//        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!!!";
//    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!!!";
    }

    //UC3
    @PostMapping("/greet")
    public User sayPostHello(@RequestBody User user) {
        User newUser;
        newUser = serviceLayer.sayPostHello(user);
        return newUser;
        //    return "Hello "+user.getFirstName() +" "+ user.getLastName() + "!!!";
    }

    @PostMapping("/save")                              //UC-4
    public User saySaveHello(@RequestBody User user) {
        User newUser;
        newUser = serviceLayer.sayPostHello(user);
        return newUser;
    }

    @GetMapping("/show/{id}")
    public Optional<User> showById(@PathVariable int id) {
        Optional<User> response = serviceLayer.showById(id);
        return response;
    }

    @GetMapping("/show")
    public List<User> showAll() {
        List<User> response = serviceLayer.showAll();
        return response;
    }
}
