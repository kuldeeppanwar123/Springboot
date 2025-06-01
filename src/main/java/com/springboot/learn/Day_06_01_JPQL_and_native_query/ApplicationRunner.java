package com.springboot.learn.Day_06_01_JPQL_and_native_query;

import com.springboot.learn.Day_06_01_JPQL_and_native_query.entity.Booking;
import com.springboot.learn.Day_06_01_JPQL_and_native_query.entity.Driver;
import com.springboot.learn.Day_06_01_JPQL_and_native_query.repository.BookingRepository;
import com.springboot.learn.Day_06_01_JPQL_and_native_query.repository.DriverRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
@Transactional
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private DriverRepository driverRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("************************************");
//        Driver driver = new Driver();
//        driver.setName("Kuldeep");
//        driver.setLicenseNo("444444");
//
//        Booking b1 = new Booking();
//        b1.setDistance(33L);
//        b1.setStatus("pending");
//        b1.setDriver(driver);
//
//        Booking b2 = new Booking();
//        b2.setDistance(44L);
//        b2.setStatus("pending");
//        b2.setDriver(driver);
//
//        Booking b3 = new Booking();
//        b3.setDistance(55L);
//        b3.setStatus("completed");
//        b3.setDriver(driver);
//
//        Driver driver2 = new Driver();
//        driver2.setName("Kuldeep");
//        driver2.setLicenseNo("444444");
//
//        Booking b4 = new Booking();
//        b4.setDistance(66L);
//        b4.setStatus("pending");
//        b4.setDriver(driver2);
//
//        Booking b5 = new Booking();
//        b5.setDistance(77L);
//        b5.setStatus("pending");
//        b5.setDriver(driver2);
//
//        Booking b6 = new Booking();
//        b6.setDistance(88L);
//        b6.setStatus("completed");
//        b6.setDriver(driver2);
//
//        driver.setBookings(List.of(b1, b2, b3));
//        driverRepository.save(driver);
//
//        driver2.setBookings(List.of(b4, b5, b6));
//
//        driverRepository.save(driver2);

//        List<Long>driverIds = new ArrayList<>(Arrays.asList(7L, 8L));
//        Optional<List<Driver>>drivers = driverRepository.findAllByIdIn(driverIds);
//
//        for(Driver d:drivers.get()){
//            List<Booking>bookings = d.getBookings();
//            System.out.println(d);
//            bookings.forEach(booking -> System.out.println(booking));
//        }
        Optional<Driver>driver = driverRepository.findById(7L);
        System.out.println(driver);
        List<Booking>bookings = driver.get().getBookings();
    }
}
