package com.example.homework1.service;

import com.example.homework1.pojo.TeacherStudent;
import com.example.homework1.repository.TeacherStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-9:51 PM
 * @description
 */
@Service
public interface TeacherStudentService {
    List<TeacherStudent> getAllTeacherStudents();
}
