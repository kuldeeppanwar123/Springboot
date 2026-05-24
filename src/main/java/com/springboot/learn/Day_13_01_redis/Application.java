package com.springboot.learn.Day_13_01_redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Application implements CommandLineRunner {
    @Autowired

    public static void main(String[] args) {
        SpringApplication.run(com.springboot.learn.Day_12_03_spring_state_machine.Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}