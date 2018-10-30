package com.dao.test;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBusiness {

    @Test
    public void one(){

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-dao.xml");
        String ns[]=context.getBeanDefinitionNames();
        for(String n : ns){
            System.out.println(n);
        }
    }


}
