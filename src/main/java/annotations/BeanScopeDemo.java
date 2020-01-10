package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Coach theCoach = context.getBean("thatCoach", Coach.class);
        Coach theCoach1 = context.getBean("thatCoach", Coach.class);
        boolean res = (theCoach == theCoach1);
        System.out.println(res);
        System.out.println(theCoach + ", " + theCoach1);
        context.close();
    }

}
