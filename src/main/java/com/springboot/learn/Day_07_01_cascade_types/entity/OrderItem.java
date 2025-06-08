package com.springboot.learn.Day_07_01_cascade_types.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderItem extends BaseModel {
    private String name;
    private Long price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
