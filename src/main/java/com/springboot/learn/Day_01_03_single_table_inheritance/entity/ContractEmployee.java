package com.springboot.learn.Day_01_03_single_table_inheritance.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CNTR")
@AllArgsConstructor
@NoArgsConstructor
public class ContractEmployee extends Employee {
    private int contractPeriod;

    @Builder
    public ContractEmployee(Long id, String name, int contractPeriod) {
        super(id, name);
        this.contractPeriod = contractPeriod;
    }

    @Override
    public String toString() {
        return "CNTR{" +
                "id=" + id +
                ", name=" + name +
                ", contractPeriod='" + contractPeriod +
                '}';
    }
}
