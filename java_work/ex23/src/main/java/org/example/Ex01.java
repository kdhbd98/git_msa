package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01 {

    public static void main(String[] args) {

        Box<Apple> abox = new Box<Apple>();
        Box<Orange> obox = new Box<Orange>();

        Box<String> pbox = new Box();

        Box<Scanner> scannerBox = new Box();
        Box<StringTokenizer> box = new Box();
        Box<Random> randomBox = new Box();

        abox.setObj(new Apple());
        obox.setObj(new Orange());
        pbox.setObj("pineapple");

        Apple apple = (Apple) abox.getObj();
        Orange orange = (Orange) obox.getObj();

        String a = """
                apple
                orange
                pineapple
                """.formatted(10, 20);
    }
}
