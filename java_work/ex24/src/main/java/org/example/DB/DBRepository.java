package org.example.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBRepository {
    public void insert() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("name : ");
            String name = scanner.next();
            System.out.println("age : ");
            int age = scanner.nextInt();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/new", "root", "1234");
            System.out.println("success");
            PreparedStatement preparedStatement
                    = connection.prepareStatement("Insert into member (name, age) VALUES (?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void select() {
        System.out.println("Select.");
    }
}
