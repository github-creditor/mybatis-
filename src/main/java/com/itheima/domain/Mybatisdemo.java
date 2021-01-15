package com.itheima.domain;

import com.itheima.dao.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class Mybatisdemo {

    InputStream in;
    SqlSessionFactoryBuilder builder;
    SqlSessionFactory factory;
    SqlSession sql;


    @Test       //添加功能
    public void takeinsert() throws IOException {
        takeSession();
        IUserDao mapper = sql.getMapper(IUserDao.class);
        User user=new User();
        user.setUsername("小花");
        user.setAddress("北京");
        user.setBirthday(new Date());
        user.setSex("男");

        mapper.takeinseter(user);

        sql.commit();

        System.out.println("执行成功");
        close();

    }













    public void takeSession() throws IOException {
        //读取配置文件
         in = Resources.getResourceAsStream("take.xml");
        //创建工厂
        builder=new SqlSessionFactoryBuilder();
        factory = builder.build(in);

        //使用工厂创建sqlsession对象
        sql=factory.openSession();

    }

    public void close() throws IOException {
        sql.close();
        in.close();

    }

    }

