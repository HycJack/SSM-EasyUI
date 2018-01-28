package com.hyc.mappers;


import com.hyc.base.BaseDao;
import com.hyc.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseDao<Student>{

    Student selectByPrimaryKey(Integer id);

    Student queryByStuName(String stuName);
}