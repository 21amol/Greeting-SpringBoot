package com.example.greetingspringboot.service;
import com.example.greetingspringboot.model.User;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
    public String sayHello() {
        return "Hello World!!!";
    }

    public String sayPostHello(User user) {
   //     User newUser = new User(user);
        return "Hello Mr."+user.getFirstName() +" "+ user.getLastName() + "!!!";
    }
}
