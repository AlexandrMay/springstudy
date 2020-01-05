package com.may;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach getCoach1 = context.getBean("myCoach1", Coach.class);
        Coach getCoach2 = context.getBean("myCoach2", Coach.class);
        Coach getCoach3 = context.getBean("myCoach3", Coach.class);
        System.out.println(getCoach1.getDailyWorkout());
        System.out.println(getCoach1.getDailyFortune());
        System.out.println();
        System.out.println(getCoach2.getDailyWorkout());
        System.out.println(getCoach2.getDailyFortune());
        System.out.println();
        System.out.println(getCoach3.getDailyWorkout());
        System.out.println(getCoach3.getDailyFortune());
        context.close();
    }

}
