package com.example.homework1.service;

import com.example.homework1.pojo.TeacherStudent;
import com.example.homework1.repository.TeacherStudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZHONGXI FENG
 * @projectName Antra_HW
 * @create 6/14/2023-9:54 PM
 * @description
 */
@Service
@Slf4j
public class TeacherStudentServiceImpl implements TeacherStudentService {
    private final TeacherStudentRepository teacherStudentRepository;

    TeacherStudentServiceImpl(TeacherStudentRepository teacherStudentRepository) {
        this.teacherStudentRepository = teacherStudentRepository;
    }

    @Override
    public List<TeacherStudent> getAllTeacherStudents() {
        log.info("[myInfo]-try to get all teacherStudents information-[myInfo]");
        List<TeacherStudent> all = teacherStudentRepository.findAll();
        return all;
    }
}
