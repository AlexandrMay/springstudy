package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Coach theCoach = context.getBean("thatCoach", Coach.class);
        Coach theCoach1 = context.getBean("soccerCoach", Coach.class);
        Coach theCoach2 = context.getBean("basketballCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println();

        System.out.println(theCoach1.getDailyWorkout());
        System.out.println(theCoach1.getDailyFortune());
        System.out.println();

        System.out.println(theCoach2.getDailyWorkout());
        System.out.println(theCoach2.getDailyFortune());

        context.close();
    }

}
