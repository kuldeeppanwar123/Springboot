package com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment {
    @EmbeddedId
    private EnrollmentId id = new EnrollmentId();

    @ManyToOne
    @MapsId("courseId")
    @JsonBackReference
    private Student student;

    @ManyToOne
    @MapsId("studentId")
    @JsonBackReference
    private Course course;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
