package com.example.homework1.controller;

import com.example.homework1.pojo.Student;
import com.example.homework1.response.ResponseData;
import com.example.homework1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public ResponseData getAllStudents(){
        List<Student> allStudents = studentService.getAllStudents();
        ResponseData responseData = new ResponseData();
        responseData.put("allStudents",allStudents);
        return responseData;
    }
    @GetMapping("/student/{id}")
    public ResponseData getStudentById(@PathVariable String id){
        Student student = studentService.getStudentById(Integer.parseInt(id));
        ResponseData responseData = new ResponseData();
        responseData.put("student",student);
        return responseData;
    }

    @PutMapping(value = "/student",params = {"name","age"})
    public ResponseData insertNewStudent(@RequestParam("name")String name,@RequestParam("age")Integer age){
        Student student = studentService.insertNewStudent(name, age);
        ResponseData responseData = new ResponseData();
        responseData.put("student",student);
        return responseData;
    }

    @PutMapping(value = "/student", params = {"id","name","age"})
    public ResponseData updateStudent(@RequestParam("id")Integer id,@RequestParam("name")String name,@RequestParam("age")Integer age){
        Student student = studentService.updateStudentById(id, name, age);
        ResponseData responseData = new ResponseData();
        responseData.put("student",student);
        return responseData;
    }

    @DeleteMapping("/student/{id}")
    public ResponseData deleteStudent(@PathVariable("id")Integer id){
        studentService.deleteStudentById(id);
        ResponseData responseData = new ResponseData();
        responseData.put("message","Delete Successfully");
        return responseData;
    }
}
