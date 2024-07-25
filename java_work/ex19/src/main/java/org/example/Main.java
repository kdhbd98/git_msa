package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a/b);
        }catch (Exception a){
            System.out.println(a.getMessage());
//            a.printStackTrace();
        }
        System.out.println("Complete successfully");
    }
}