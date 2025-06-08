package com.springboot.learn.Day_06_02_fetch_modes.repository;

import com.springboot.learn.Day_06_02_fetch_modes.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
