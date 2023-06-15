package com.example.homework1.controller;

import com.example.homework1.pojo.Teacher;
import com.example.homework1.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-8:05 PM
 * @description
 */
@RestController
public class TeacherController {
    private final TeacherService teacherService;

    @Autowired
    TeacherController(TeacherService teacherService){
        this.teacherService = teacherService;
    }

    @GetMapping("/teacher")
    public ResponseEntity<List<Teacher>> getAllTeacher(){
        List<Teacher> allTeachers = teacherService.getAllTeachers();
        return new ResponseEntity<>(allTeachers, HttpStatus.OK);
    }

    @GetMapping("/teacher/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable Integer id){
        Teacher teacher = teacherService.getTeacherById(id);
        return new ResponseEntity<>(teacher,HttpStatus.OK);
    }
}
