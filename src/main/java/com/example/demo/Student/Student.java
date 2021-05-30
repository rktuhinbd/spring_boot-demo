package com.example.demo.Student;

import java.time.LocalDate;

public class Student {

    private long id;
    private String name;
    private String phone;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(long id, String name, String phone, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String phone, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}