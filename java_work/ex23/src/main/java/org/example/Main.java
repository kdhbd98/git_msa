package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person[] parr ={
                new Person("aaa", 40),
                new Person("bbb", 30),
                new Person("ccc", 20),
                new Person("ddd", 10),
        };

        Arrays.sort(parr);
        System.out.println(Arrays.toString(parr));
    }
}