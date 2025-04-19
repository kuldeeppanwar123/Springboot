package com.springboot.learn.Day_01_01_mappedsuperclass.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "laptops")
public class Laptop extends BaseEntity{
    private String name;
    private Long price;
}
