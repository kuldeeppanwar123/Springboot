package com.springboot.learn.Day_02_07_one_to_many_association_bidirectional;

import com.springboot.learn.Day_02_07_one_to_many_association_bidirectional.entity.Order;
import com.springboot.learn.Day_02_07_one_to_many_association_bidirectional.entity.OrderItem;
import com.springboot.learn.Day_02_07_one_to_many_association_bidirectional.repository.OrderItemRepository;
import com.springboot.learn.Day_02_07_one_to_many_association_bidirectional.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Optional;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;
    @Transactional
    public void run(String... args) {
        System.out.println("day 02 07 running...");

//        OrderItem orderItem1 = new OrderItem();
//        orderItem1.setPrice(BigDecimal.valueOf(10000));
//        orderItem1.setQuantity(9);
//
//        OrderItem orderItem2 = new OrderItem();
//        orderItem2.setPrice(BigDecimal.valueOf(20000));
//        orderItem2.setQuantity(8);
//
//        Order order = new Order();
//        order.setTotalPrice(BigDecimal.valueOf(40000));
//        order.setTotalQuantity(333);
//        order.setStatus("INPROGRESS");
//        order.addOrderItm(orderItem1);
//        order.addOrderItm(orderItem2);
//        orderRepository.save(order);

        Optional<Order>order = orderRepository.findById(1L);
        System.out.println(order.get());

        Optional<OrderItem>orderItem = orderItemRepository.findById(1L);
        System.out.println(orderItem.get());
    }
}
