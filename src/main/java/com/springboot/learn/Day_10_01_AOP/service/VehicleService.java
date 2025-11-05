package com.springboot.learn.Day_10_01_AOP.service;

import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    public void runVehicle(Boolean isStarted){
        System.out.println("vehicle running");
    }

    public void stopVehicle(Boolean isStarted){
        System.out.println("vehicle stopped");
    }

    public void applyBreak(Boolean isStarted){
        System.out.println("vehicle apply break");
    }
}
