package com.springboot.learn.Day_10_02_AOP.service;

import com.springboot.learn.Day_10_02_AOP.annotation.LogExecution;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @LogExecution
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
