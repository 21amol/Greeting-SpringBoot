package com.example.greetingspringboot.controller;
import com.example.greetingspringboot.model.User;
import com.example.greetingspringboot.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Hello")
public class GreetingController {

    //UC2
    @Autowired
    ServiceLayer serviceLayer;
    @GetMapping("/ser")
    public String sayHello(){
        String response = serviceLayer.sayHello();
        return response;
    }

//
//        @RequestMapping(value = { "","/Home"})
//        public String sayHello() {
//            return "Hello, I am Amol!!!";
//        }

        @RequestMapping(value = {"/hello-w"}, method = RequestMethod.GET)
        public String sayHelloDifferently() {
            return "Hello Everyone, its me Amol!!!";
        }

        @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
        public String sayHello(@RequestParam(value = "name") String name) {
            return "Hello " + name  + "!!!";
        }

        @GetMapping("/param/{name}")
        public String sayHelloParam(@PathVariable String name) {
            return "Hello " + "Mr." + name  + "!!!";
        }

        @PostMapping("/post")
        public String sayHello(@RequestBody User user) {
            return "Hello " + user.getFirstName() + " " + user.getLastName() + "!!!";
        }

        @PutMapping("/put/{firstName}")
        public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
            return "Hello " + firstName + " " + lastName + "!!!";
        }
}
