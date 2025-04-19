package com.springboot.learn.Day_01_02_single_table_inheritance;

import com.springboot.learn.Day_01_02_single_table_inheritance.entity.Bike;
import com.springboot.learn.Day_01_02_single_table_inheritance.entity.Car;
import com.springboot.learn.Day_01_02_single_table_inheritance.entity.Vehicle;
import com.springboot.learn.Day_01_02_single_table_inheritance.repository.BikeRepository;
import com.springboot.learn.Day_01_02_single_table_inheritance.repository.CarRepository;
import com.springboot.learn.Day_01_02_single_table_inheritance.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    CarRepository carRepository;
    @Autowired
    BikeRepository bikeRepository;

    public void run(String... args) {
        System.out.println("day 2 command line runner...");
        Car car = Car.builder()
                .color("white")
                .price(5000L)
                .numOfDoors(8)
                .build();

        Bike bike = Bike.builder()
                .color("black")
                .price(1000L)
                .petrolCapacity(12)
                .build();

        bikeRepository.save(bike);
        carRepository.save(car);

        List<Vehicle>vehicles = vehicleRepository.findAll();
        List<Car>cars = carRepository.findAll();
        List<Bike>bikes = bikeRepository.findAll();

        // Print using toString()
        System.out.println("=== All Cars ===");
        System.out.println(cars);

        System.out.println("=== All Bikes ===");
        System.out.println(bikes);

        System.out.println("=== All Vehicles ===");
        System.out.println(vehicles);

    }
}
