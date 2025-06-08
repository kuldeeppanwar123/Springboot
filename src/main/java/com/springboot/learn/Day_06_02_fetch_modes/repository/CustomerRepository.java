package com.springboot.learn.Day_06_02_fetch_modes.repository;

import com.springboot.learn.Day_06_02_fetch_modes.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<List<Customer>> findAllByIdIn(List<Long>customerIds);
}
