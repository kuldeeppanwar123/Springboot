package com.springboot.learn.Day_06_01_JPQL_and_native_query.entity;

import jakarta.persistence.*;
import lombok.Getter;

//@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
@Getter
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
}
