package com.springboot.learn.Day_06_01_JPQL_and_native_query.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Setter
@Getter
public class Driver extends BaseModel {
    private String name;
    private String licenseNo;
    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Fetch(value = FetchMode.JOIN)
    private List<Booking> bookings;

    public String toString() {
        return "Driver: { id: "+this.id+", name: "+this.name+", licenseNo: "+this.licenseNo+" }";
    }
}
