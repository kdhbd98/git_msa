package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn
                    = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/aaa", "root", "1234");
            System.out.println("Did it work?");

            PreparedStatement pstmt
                    = conn.prepareStatement("INSERT INTO student values ('유하민',100,90,80)");
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}