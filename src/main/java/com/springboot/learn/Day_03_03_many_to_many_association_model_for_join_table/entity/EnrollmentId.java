package com.springboot.learn.Day_03_03_many_to_many_association_model_for_join_table.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Setter
@Getter
public class EnrollmentId implements Serializable {
    private Long studentId;
    private Long courseId;

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof EnrollmentId)) return false;
        EnrollmentId that = (EnrollmentId) o;
        return Objects.equals(studentId, that.studentId) && Objects.equals(courseId, that.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, courseId);
    }
}
