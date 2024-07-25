package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex06 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/aaa", "root", "1234");
            System.out.println("Did it work?");
            PreparedStatement preparedStatement = conn.prepareStatement("Insert into student values ('박문치', '100','100','100')");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
