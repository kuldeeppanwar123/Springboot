package com.springboot.learn.Day_02_07_one_to_many_association_bidirectional.repository;

import com.springboot.learn.Day_02_07_one_to_many_association_bidirectional.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
