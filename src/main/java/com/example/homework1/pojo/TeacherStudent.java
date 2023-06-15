package com.example.homework1.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-3:08 PM
 * @description
 */
@Entity
@Table(name = "teachers_students")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TeacherStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    Teacher teacher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    Student student;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherStudent that = (TeacherStudent) o;
        return Objects.equals(id, that.id) && Objects.equals(teacher, that.teacher) && Objects.equals(student, that.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teacher, student);
    }
}
