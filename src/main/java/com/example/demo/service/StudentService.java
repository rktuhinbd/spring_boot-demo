package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Boolean saveStudent(Student student) {
        studentRepository.save(student);
        return true;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
