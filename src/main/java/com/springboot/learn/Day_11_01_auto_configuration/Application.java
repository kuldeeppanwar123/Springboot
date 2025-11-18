package com.springboot.learn.Day_11_01_auto_configuration;

import com.springboot.learn.Day_11_01_auto_configuration.bean.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    ApplicationContext applicationContext;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Payment payment = applicationContext.getBean(Payment.class);
        payment.pay();
    }
}
