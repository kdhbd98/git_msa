package org.example;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 30);
        Person p2 = new Person("김길동", 40);
        Person p3 = new Person("박길동", 50);

        Person person[]={p1,p2,p3};
        for (Person p : person) {
            System.out.println(p);
        }

        Arrays.sort(person);
        for (Person p : person){
            System.out.println(p);
        }

        int index = Arrays.binarySearch(person,p1);
        System.out.println(index);
        System.out.println(person[index]);
    }
}
