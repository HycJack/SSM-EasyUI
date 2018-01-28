package com.hyc.mappers;

import com.hyc.utils.MybatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jack on 2018-01-28.
 */
public class StudentMapperTest {

    private SqlSession sqlSession;
    private SqlSession sqlProductSession;

    @Before
    public void init(){
        sqlSession = MybatisSqlSessionFactory.openSession();
        sqlProductSession = MybatisSqlSessionFactory.openProductSession();
    }

    @Test
    public void findAllStudents() throws Exception {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(studentMapper.findAllStudents());
    }

    @Test
    public void findAllUsers() throws Exception {
        UserMapper userMapper = sqlProductSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findAllUsers());
    }

    @Test
    public void findStudentById() throws Exception {

    }

    @Test
    public void insertStudent() throws Exception {

    }

}