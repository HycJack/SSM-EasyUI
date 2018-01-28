package com.hyc.service.impl;

import com.hyc.domain.Student;
import com.hyc.mappers.StudentMapper;
import com.hyc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jack on 2017-kindeditor-23.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getPageStudent(Map<String, Object> map) {
        //执行查询
        List<Student> list = studentMapper.queryList(map);

        return list;
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return studentMapper.queryTotal(map);
    }

    @Override
    public Student queryByStuName(String stuName) {
        return null;
    }

    @Override
    public Student queryObject(Integer id) {
        return studentMapper.queryObject(id);
    }

    @Override
    public void save(Student student) {
        studentMapper.save(student);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public void deleteBatch(Integer[] studentIds) {
        studentMapper.deleteBatch(studentIds);
    }

}
