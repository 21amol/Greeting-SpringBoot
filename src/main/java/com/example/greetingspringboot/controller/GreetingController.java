package com.example.greetingspringboot.controller;

import com.example.greetingspringboot.model.User;
import com.example.greetingspringboot.repository.SpringRepo;
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
//    @Autowired
//    SpringRepo springRepository;

    @GetMapping("/server")                           //UC-2
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

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!!!";
    }

    @PostMapping("/save")
    public User saySaveHello(@RequestBody User user) {
        User newUser;
        newUser = serviceLayer.sayPostHello(user);
        return newUser;
    }

    @GetMapping("/show/{id}")
    public Optional<User> showById(@PathVariable int id) {
        Optional<User> response;
        response = serviceLayer.showById(id);
        return response;
    }

    @GetMapping("/show")
    public List<User> showAll() {
        List<User> response;
        response = serviceLayer.showAll();
        return response;
    }

    @PutMapping("/edit/{id}")
  //  public User edit(@RequestBody User user) {
    public User edit(@RequestBody User user, @PathVariable int id) {
        User response;
        response = serviceLayer.edit(id, user);
        return response;
   //     return springRepository.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        String response;
        response = serviceLayer.delete(id);
        return response;
    }
}
