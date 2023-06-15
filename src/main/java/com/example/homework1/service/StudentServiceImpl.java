package com.example.homework1.service;

import com.example.homework1.pojo.Student;
import com.example.homework1.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-3:21 PM
 * @description
 */
@Service
@Slf4j
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl( StudentRepository studentRepository){
        this.studentRepository =studentRepository;
    }


    @Override
    public List<Student> getAllStudents() {
        int a = 1/0;//test exception Handler
        log.info("[myInfo]-try to get all students-[myInfo]");
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        log.info("[myInfo]-try to get student by Id "+id+" -[myInfo]");
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }
}
