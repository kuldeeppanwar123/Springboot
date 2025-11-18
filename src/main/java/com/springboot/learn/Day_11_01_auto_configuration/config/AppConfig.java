package com.springboot.learn.Day_11_01_auto_configuration.config;

import com.springboot.learn.Day_11_01_auto_configuration.bean.Payment;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class AppConfig {
    @Bean
    public Payment payment() {
        return new Payment();
    }
}
