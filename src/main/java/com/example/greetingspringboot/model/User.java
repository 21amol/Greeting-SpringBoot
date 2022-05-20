package com.example.greetingspringboot.model;
import javax.persistence.Entity;


//@Entity
public class User {
    private String firstName;
    private String lastName;

    public User(){}
    public User(User user) {
        super();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }

//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
