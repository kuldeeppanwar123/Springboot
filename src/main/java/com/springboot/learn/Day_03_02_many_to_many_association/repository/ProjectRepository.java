package com.springboot.learn.Day_03_02_many_to_many_association.repository;

import com.springboot.learn.Day_03_02_many_to_many_association.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
