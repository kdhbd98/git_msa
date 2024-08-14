package org.example.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBRepository {
    public void insert() {
        try {

//          1. mysql jar 추가 확인
            Class.forName("com.mysql.cj.jdbc.Driver");

//          2. connection 연결
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/new", "root", "1234");
            System.out.println("success");

//          3. sql 문 작성
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Come on.");
    }

    public void select() {
        System.out.println("Select.");
    }
}
