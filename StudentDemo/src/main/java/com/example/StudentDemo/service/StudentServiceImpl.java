package com.example.StudentDemo.service;

import com.example.StudentDemo.model.Student;
import com.example.StudentDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceImpl extends StudentService  {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
