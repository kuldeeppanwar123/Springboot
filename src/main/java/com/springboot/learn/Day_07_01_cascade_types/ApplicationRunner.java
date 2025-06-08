package com.springboot.learn.Day_07_01_cascade_types;

import com.springboot.learn.Day_07_01_cascade_types.entity.Order;
import com.springboot.learn.Day_07_01_cascade_types.entity.OrderItem;
import com.springboot.learn.Day_07_01_cascade_types.repository.OrderItemRepository;
import com.springboot.learn.Day_07_01_cascade_types.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application is running...");
//        Order order = new Order();
//        OrderItem orderItem1 = new OrderItem();
//        OrderItem orderItem2 = new OrderItem();
//        orderItem1.setName("laptop");
//        orderItem1.setPrice(200L);
//        orderItem1.setOrder(order);
//
//        orderItem2.setName("Phone");
//        orderItem2.setPrice(300L);
//        orderItem2.setOrder(order);
//
//        order.setOrderItems(List.of(orderItem1, orderItem2));
//        orderRepository.save(order);

//        Optional<Order> order = orderRepository.findById(2L);
//        OrderItem orderItem = order.get().getOrderItems().get(0);
//        orderItem.setName("RRR movie");
//        order.get().setTotal(10000L);
//        orderRepository.save(order.get());

        orderRepository.deleteById(2L);
    }
}
