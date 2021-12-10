package com.example.abhinav;

import com.example.abhinav.entity.User;
import com.example.abhinav.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbhinavApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AbhinavApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) {
        userRepository.save(new User("Abhinav","MCA"));
        userRepository.save(new User("Raj","MCA"));
        userRepository.save(new User("Rahul","MCA"));


    }
}
