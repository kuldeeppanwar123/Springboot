package com.springboot.learn.Day_02_07_one_to_many_association_bidirectional.repository;

import com.springboot.learn.Day_02_07_one_to_many_association_bidirectional.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
