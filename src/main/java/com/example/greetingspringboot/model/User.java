package com.example.greetingspringboot.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {

    @Id
    @GeneratedValue
    public int id;
    private String firstName;
    private String lastName;

    public User(){

    }

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
