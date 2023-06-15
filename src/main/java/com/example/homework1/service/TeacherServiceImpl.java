package com.example.homework1.service;

import com.example.homework1.pojo.Teacher;
import com.example.homework1.repository.TeacherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-3:31 PM
 * @description
 */
@Service
@Slf4j
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;

    @Autowired
    TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        log.info("[myInfo]-try to get all teachers-[myInfo]");
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getTeacherById(int id) {
        log.info("[myInfo]-try to get teacher by Id "+id+" -[myInfo]");
        Optional<Teacher> teacher = teacherRepository.findById(id);
        return teacher.orElse(null);
    }
}
