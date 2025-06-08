package com.springboot.learn.Day_06_02_fetch_modes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Setter
@Getter
@Table(name = "orders")
public class Order extends BaseModel{
    private Long price;
    @ManyToOne
    @JoinColumn(name = "customer_id")
//    @Fetch(FetchMode.SUBSELECT)
    private Customer customer;

    public String toString() {
        return "Order: { id: "+this.id+", price: "+this.price+" }";
    }
}
