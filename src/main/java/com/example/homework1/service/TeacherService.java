package com.example.homework1.service;

import com.example.homework1.pojo.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-3:30 PM
 * @description
 */
@Service
public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(int id);
}
