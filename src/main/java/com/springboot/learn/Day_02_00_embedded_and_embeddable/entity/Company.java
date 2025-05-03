package com.springboot.learn.Day_02_00_embedded_and_embeddable.entity;

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
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "firstName", column = @Column(name = "contact_person_first_name")),
            @AttributeOverride(name = "lastName", column = @Column(name = "contact_person_last_name"))
    })
    private ContactPerson contactPerson;
}
