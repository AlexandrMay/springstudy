package hiber.demo;

import hiber.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Student.class)
                                    .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();

            List<Student> students = session.createQuery("from Student").list();
            forStudents(students);
            System.out.println();
            students = session.createQuery("from Student s where s.lastName = 'Neo'").list();
            forStudents(students);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }

    private static void forStudents(List<Student> students) {
        for (Student temp : students) {
            System.out.println(temp);
        }
    }
}
