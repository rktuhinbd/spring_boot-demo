package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "Md. Rejaul Karim",
                        "01841752600",
                        "rktuhinbd@gmail.com",
                        LocalDate.of(1994, Month.JULY, 15),
                        26)
        );
    }
}
