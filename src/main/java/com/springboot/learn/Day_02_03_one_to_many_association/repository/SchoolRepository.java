package com.springboot.learn.Day_02_03_one_to_many_association.repository;

import com.springboot.learn.Day_02_03_one_to_many_association.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
}
