package com.springboot.learn.Day_02_07_one_to_many_association_bidirectional.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "orderItems")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")
    private int quantity;

    // default fetch type for ManyToOne: EAGER
    @ManyToOne(fetch = FetchType.EAGER)
    private Order order;

    public String toString() {
        return "OrderItem: { price: "+this.price+", quantity: "+this.quantity+" }";
    }
}
