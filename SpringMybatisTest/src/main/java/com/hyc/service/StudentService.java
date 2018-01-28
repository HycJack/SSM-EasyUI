package com.hyc.service;

import com.hyc.domain.Student;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Jack on 2017-kindeditor-23.
 */
public interface StudentService {
    public List<Student> getPageStudent(Map<String, Object> map);

    /**
     * 查询总数
     */
    int queryTotal(Map<String, Object> map);

    /**
     * 根据学生名，查询学生
     */
    Student queryByStuName(String stuName);

    /**
     * 根据ID，查询学生
     * @param id
     * @return
     */
    Student queryObject(Integer id);

    /**
     * 保存学生
     */
    void save(Student student);

    /**
     * 修改学生
     */
    void update(Student student);

    /**
     * 删除用户
     */
    void deleteBatch(Integer[] studentIds);
}
