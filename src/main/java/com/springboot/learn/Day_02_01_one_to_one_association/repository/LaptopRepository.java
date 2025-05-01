package com.springboot.learn.Day_02_01_one_to_one_association.repository;

import com.springboot.learn.Day_02_01_one_to_one_association.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
