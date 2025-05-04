package com.springboot.learn.Day_02_07_one_to_many_association_bidirectional.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "totalQuantity")
    private int totalQuantity;

    @Column(name = "total_Price")
    private BigDecimal totalPrice;

    @Column(name = "status")
    private String status;

    @Column(name = "created_At")
    @CreationTimestamp
    private Date dateCtreated;

    @Column(name = "updated_At")
    @UpdateTimestamp
    private Date lastUpdated;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems = new ArrayList<>();

    public void addOrderItm(OrderItem item) {
        this.orderItems.add(item);
        item.setOrder(this);
    }

    public String toString( ){
        return "Order: { totalPrice: "+this.totalPrice+", totalQnty: "+this.totalQuantity+", status: "+this.status+", createdAt: "+this.dateCtreated+", updatedAt: "+this.lastUpdated+", orderItems: "+this.orderItems+" }";
    }
}
