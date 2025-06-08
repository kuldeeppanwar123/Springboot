package com.springboot.learn.Day_06_02_fetch_modes.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

//@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
@Getter
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
}
