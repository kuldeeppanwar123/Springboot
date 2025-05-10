package com.springboot.learn.Day_03_01_many_to_many_association.repository;

import com.springboot.learn.Day_03_01_many_to_many_association.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByPriceLessThan(Double fee);
}
