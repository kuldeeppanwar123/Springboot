package com.springboot.learn.Day_05_02_one_to_many_eager_lazy_loading.repository;

import com.springboot.learn.Day_05_02_one_to_many_eager_lazy_loading.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
