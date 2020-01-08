package com.may;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Coach theCoach = context.getBean("myCoach33", Coach.class);
        System.out.println(theCoach.getDailyWorkout());

        context.close();

    }

}
