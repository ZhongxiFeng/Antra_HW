package com.example.homework1.controller;

import com.example.homework1.pojo.TeacherStudent;
import com.example.homework1.service.TeacherStudentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-9:46 PM
 * @description
 */
@RestController
public class TeacherStudentController {
    TeacherStudentServiceImpl teacherStudentService;

    TeacherStudentController(TeacherStudentServiceImpl teacherStudentService) {
        this.teacherStudentService = teacherStudentService;
    }

    @GetMapping("/teacherStudent")
    public ResponseEntity<List<TeacherStudent>> getAllTeacherStudents() {
        List<TeacherStudent> allTeacherStudents = teacherStudentService.getAllTeacherStudents();
        return new ResponseEntity<>(allTeacherStudents, HttpStatus.OK);
    }
}
