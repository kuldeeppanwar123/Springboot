package com.springboot.learn.Day_06_01_JPQL_and_native_query.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Booking extends BaseModel {
    private Long distance;
    private String status;

    @ManyToOne
    @JoinColumn(name = "driverId")
    private Driver driver;

    public String toString() {
        return "Booking: { id: "+this.id+", distance: "+this.distance+", status: "+this.status+", driver: "+this.driver+" }";
    }
}
