package hiber.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://db4free.net:3306/maydbfortest";
        String user = "alexandr_may";
        String password = "4jKQZDa9QExQziW";

        System.out.println("Connecting ... "  + jdbcURL);
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connection successfull!!!");

    }

}
