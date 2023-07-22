package com.ahmetsenocak.cruddemo.dao;

import com.ahmetsenocak.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findLastName(String lastName);

    void update(Student theStudent);

    void delete(Integer id);
}
