package com.example.homework1.controller;

import com.example.homework1.pojo.TeacherStudent;
import com.example.homework1.response.ResponseData;
import com.example.homework1.service.TeacherStudentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
    public ResponseData getAllTeacherStudents() {
        List<TeacherStudent> allTeacherStudents = teacherStudentService.getAllTeacherStudents();
        ResponseData responseData = new ResponseData();
        responseData.put("allTeacherStudents",allTeacherStudents);
        return responseData;
    }
}
