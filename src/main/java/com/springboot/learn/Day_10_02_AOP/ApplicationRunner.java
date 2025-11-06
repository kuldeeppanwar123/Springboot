package com.springboot.learn.Day_10_02_AOP;

import com.springboot.learn.Day_10_02_AOP.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    VehicleService vehicleService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("************************************");
        vehicleService.runVehicle(true);
    }
}
