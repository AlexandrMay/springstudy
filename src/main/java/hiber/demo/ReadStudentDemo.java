package hiber.demo;

import hiber.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Student.class)
                                    .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            Student student = new Student("Weenie", "Jones", "weenie@mail.com");
            session.beginTransaction();
            session.save(student);
            Student myStudent = session.get(Student.class, student.getId());
            System.out.println(myStudent);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
