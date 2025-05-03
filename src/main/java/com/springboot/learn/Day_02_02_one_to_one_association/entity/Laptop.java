package com.springboot.learn.Day_02_02_one_to_one_association.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private Double price;

    @OneToOne(mappedBy = "laptop")
    private Student student;
    @Override
    public String toString() {
        return "Laptop { id: " + this.id +", brand: " + this.brand + ", price : " + this.price + " }";
    }
}
