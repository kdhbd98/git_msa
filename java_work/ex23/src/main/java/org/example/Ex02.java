package org.example;

public class Ex02 {

    public static void main(String[] args) {
        DBox<String, Integer> box = new DBox();
        box.setA("Park Mun-chi");
        box.setB(25);

        System.out.println(box);

        Object obj = "String";
        String str = (String) obj;
    }
}
