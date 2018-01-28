package com.hyc.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Jack on 2018-01-28.
 */
public class MybatisSqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSessionFactory productSqlSessionFactory;

    public static SqlSessionFactory getSqlSessionFactory() {
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,"development");
            } catch (IOException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSessionFactory getProductSqlSessionFactory() {
        if (productSqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                productSqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,"production");
            } catch (IOException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return productSqlSessionFactory;
    }

    public static SqlSession openSession() {
        return getSqlSessionFactory().openSession();
    }

    public static SqlSession openProductSession() {
        return getProductSqlSessionFactory().openSession();
    }
}
