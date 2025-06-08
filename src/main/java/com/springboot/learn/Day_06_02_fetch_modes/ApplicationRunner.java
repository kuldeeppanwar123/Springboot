package com.springboot.learn.Day_06_02_fetch_modes;

import com.springboot.learn.Day_06_02_fetch_modes.entity.Customer;
import com.springboot.learn.Day_06_02_fetch_modes.entity.Order;
import com.springboot.learn.Day_06_02_fetch_modes.repository.CustomerRepository;
import com.springboot.learn.Day_06_02_fetch_modes.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Transactional
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    @Override
    public void run(String... args) throws Exception {
//        Customer c1 = new Customer();
//        c1.setName("Kuldeep");
//        Customer c2 = new Customer();
//        c2.setName("Jaydeep");
//
//        Order o1 = new Order();
//        o1.setPrice(100L);
//        o1.setCustomer(c1);
//
//        Order o2 = new Order();
//        o2.setPrice(200L);
//        o2.setCustomer(c1);
//
//        Order o3 = new Order();
//        o3.setPrice(300L);
//        o3.setCustomer(c1);
//
//        Order o4 = new Order();
//        o4.setPrice(400L);
//        o4.setCustomer(c2);
//
//        Order o5 = new Order();
//        o5.setPrice(500L);
//        o5.setCustomer(c2);
//
//        c1.setOrders(List.of(o1, o2, o3));
//        c2.setOrders(List.of(o4, o5));
//
//        customerRepository.save(c1);
//        customerRepository.save(c2);

        Optional<List<Customer>> customers = customerRepository.findAllByIdIn(List.of(2L, 3L));
        for(Customer customer: customers.get()) {
            System.out.println(customer);
            System.out.println(customer.getOrders());
        }
//        System.out.println(customer.get());
//        List<Order>orders = customer.get().getOrders();
//        System.out.println(orders);

//        Optional<Order>order = orderRepository.findById(2L);
//        System.out.println(order.get());
//        System.out.println(order.get().getCustomer());
    }
}
