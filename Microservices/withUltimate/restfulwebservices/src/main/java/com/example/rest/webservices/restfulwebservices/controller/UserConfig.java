package com.example.rest.webservices.restfulwebservices.controller;


import com.example.rest.webservices.restfulwebservices.dao.UserRepository;
import com.example.rest.webservices.restfulwebservices.user.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User manoj = new User(
                    "Manoj",
                    new Date()
            );
            User ananya = new User(
                    "Ananya",
                    new Date()
            );
            repository.saveAll(
                    List.of(manoj, ananya)
            );

        };

    }
}
