package com.springboot.learn.Day_01_01_mappedsuperclass.repository;

import com.springboot.learn.Day_01_01_mappedsuperclass.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
