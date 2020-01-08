package com.may;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Coach theCoach = context.getBean("myCoach22", Coach.class);
        Coach theCoach1 = context.getBean("myCoach22", Coach.class);
        boolean res = (theCoach == theCoach1);
        System.out.println(res);
        System.out.println(theCoach);
        System.out.println(theCoach1);
        context.close();

    }

}
