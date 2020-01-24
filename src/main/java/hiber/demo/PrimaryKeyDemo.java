package hiber.demo;

import hiber.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            System.out.println("Creating 3 student object ...");
            Student student1 = new Student("Paul", "Wall", "paul@mail.com");
            Student student2 = new Student("Bill", "Smith", "bill@mail.com");
            Student student3 = new Student("Mary", "Neo", "mary@mail.com");
            session.beginTransaction();
            System.out.println("Saving the student ...");
            session.save(student1);
            session.save(student2);
            session.save(student3);
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }

}
