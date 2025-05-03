package com.springboot.learn.Day_02_00_embedded_and_embeddable.repository;

import com.springboot.learn.Day_02_00_embedded_and_embeddable.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
