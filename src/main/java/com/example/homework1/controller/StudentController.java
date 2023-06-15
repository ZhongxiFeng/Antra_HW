package com.example.homework1.controller;

import com.example.homework1.pojo.Student;
import com.example.homework1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-7:21 PM
 * @description
 */
@RestController
public class StudentController {
    private final StudentService studentService;

    @Autowired
    StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/hello")
    public String hhh(){
        return "hello";
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> allStudents = studentService.getAllStudents();
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id){
        Student student = studentService.getStudentById(Integer.parseInt(id));
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @PutMapping(value = "/student",params = {"name","age"})
    public ResponseEntity<Student> insertNewStudent(@RequestParam("name")String name,@RequestParam("age")Integer age){
        Student student = studentService.insertNewStudent(name, age);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @PutMapping(value = "/student", params = {"id","name","age"})
    public ResponseEntity<Student> updateStudent(@RequestParam("id")Integer id,@RequestParam("name")String name,@RequestParam("age")Integer age){
        Student student = studentService.updateStudentById(id, name, age);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id")Integer id){
        studentService.deleteStudentById(id);
        return new ResponseEntity<>("Delete Successfully",HttpStatus.OK);
    }
}
