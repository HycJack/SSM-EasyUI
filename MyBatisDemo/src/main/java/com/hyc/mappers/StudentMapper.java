package com.hyc.mappers;

import com.hyc.domain.Student;

import java.util.List;

/**
 * Created by Jack on 2018-01-28.
 */
public interface StudentMapper {
    List<Student> findAllStudents();
    Student findStudentById(Integer id);
    void insertStudent(Student student);
}
