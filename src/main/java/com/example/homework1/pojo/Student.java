package com.example.homework1.pojo;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-2:59 PM
 * @description
 */
@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = false)
    @JsonIgnore
    List<TeacherStudent> teacherStudents;
}
