package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

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
