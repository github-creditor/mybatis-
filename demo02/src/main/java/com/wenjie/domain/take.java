package com.wenjie.domain;


import com.wenjie.dao.demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class take {
    public static void main(String[] args) throws IOException, IOException {

        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        demo mapper = sqlSession.getMapper(demo.class);
        List<User> findall = mapper.findall();
        findall.stream().forEach(s->{
            System.out.println(s);
        });
        System.out.println("===============");
       para pa=new para();
        List<Integer> li = pa.getLi();
        li.add(41);
        li.add(42);
        SqlSession sqlSession1 = factory.openSession();
        demo mapper1 = sqlSession1.getMapper(demo.class);
        List<User> findeach = mapper1.findeach(pa);

        findeach.stream().forEach(s->{
            System.out.println(s);
        });


    }

}
