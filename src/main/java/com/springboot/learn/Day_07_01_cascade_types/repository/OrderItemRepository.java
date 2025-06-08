package com.springboot.learn.Day_07_01_cascade_types.repository;

import com.springboot.learn.Day_07_01_cascade_types.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
