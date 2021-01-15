package com.wenjie.domain;

import com.wenjie.dao.dao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class demo {
    public static void main(String[] args) throws IOException {

        InputStream in= Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();      //true为自动提交 false为手动提交
        dao mapper = sqlSession.getMapper(dao.class);
        List<user> getall = mapper.getall();
        getall.stream().forEach(s->{
            System.out.println(s);
        });


    }
}
