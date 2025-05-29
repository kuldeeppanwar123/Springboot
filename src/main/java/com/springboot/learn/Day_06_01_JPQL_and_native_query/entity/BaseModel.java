package com.springboot.learn.Day_06_01_JPQL_and_native_query.entity;

import jakarta.persistence.*;

//@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
}
