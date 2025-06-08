package com.springboot.learn.Day_07_01_cascade_types.repository;

import com.springboot.learn.Day_07_01_cascade_types.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
