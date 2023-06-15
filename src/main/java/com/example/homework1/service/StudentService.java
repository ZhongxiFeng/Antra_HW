package com.example.homework1.service;

import com.example.homework1.pojo.Student;
import com.example.homework1.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-3:18 PM
 * @description
 */
@Service
public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);

    Student insertNewStudent(String name,Integer age);
    Student updateStudentById(int id,String name,Integer age);

    void deleteStudentById(int id);

}
