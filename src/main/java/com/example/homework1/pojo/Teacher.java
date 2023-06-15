package com.example.homework1.pojo;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-3:05 PM
 * @description
 */
@Entity
@Table(name = "teachers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String subject;

    @OneToMany(mappedBy = "teacher",fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = false)
    @JsonIgnore
    List<TeacherStudent> teacherStudents;
}
