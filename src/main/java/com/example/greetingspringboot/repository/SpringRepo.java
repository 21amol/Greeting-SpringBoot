package com.example.greetingspringboot.repository;
import com.example.greetingspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringRepo extends JpaRepository<User, Integer> {

}
