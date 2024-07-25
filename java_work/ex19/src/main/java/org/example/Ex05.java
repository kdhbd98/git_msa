package org.example;

public class Ex05 {
    public static int doA() {
        try {
            int a = 10;
            int b = 0;
            return a/b;
        } catch (Exception e) {
            System.out.println("It made an exception");
            return 0;
        } finally {
            System.out.println("It'll come here definitely");
        }
//        System.out.println("It terminated normally");
    }

    public static void main(String[] args) {
        System.out.println(doA());
    }
}