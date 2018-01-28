package com.hyc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Jack on 2018-01-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
@ContextConfiguration(locations = {"classpath:application-context.xml", "classpath:application-datasource.xml" })
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void getPageStudent() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name","1");
        System.out.println(studentService.getPageStudent(map));
    }

    @Test
    public void queryTotal() throws Exception {

    }

    @Test
    public void queryByStuName() throws Exception {

    }

    @Test
    public void save() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

}