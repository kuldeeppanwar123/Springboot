package com.springboot.learn.Day_12_01_mapstruct.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String atmNumber;
    private String phoneNumber;
    private String address;
    private String pin;
    @CreatedDate
    LocalDateTime createdDate;
    @LastModifiedDate
    LocalDateTime updatedDate;
}
