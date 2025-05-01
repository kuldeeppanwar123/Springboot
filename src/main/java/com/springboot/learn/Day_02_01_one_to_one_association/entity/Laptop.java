package com.springboot.learn.Day_02_01_one_to_one_association.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private Long price;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "student_id")
//    private Student student;

    @Override
    public String toString() {
        return "Laptop { id: " + this.id +", brand: " + this.brand + ", price : " + this.price + " }";
    }
}
