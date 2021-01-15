package com.wenjie.domain;

import com.wenjie.dao.takebean1.dao1;
import com.wenjie.dao.takebean2.takeBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testdao1 {
    @Test
    public void test(){
        ApplicationContext a = new ClassPathXmlApplicationContext("bean.xml");
        dao1 a1 = a.getBean("a", dao1.class);
        a1.takedata();

    }

    @Test
    public void test1(){
        ApplicationContext a = new ClassPathXmlApplicationContext("bean.xml");
        takeBean a1 = a.getBean("c", takeBean.class);
        a1.t();


    }



}
