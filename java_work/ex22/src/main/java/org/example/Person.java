package org.example;

public class Person implements Comparable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("this = "+this);
        System.out.println("this.age = "+this.age);
        System.out.println("Person(o)"+(Person)o);
        System.out.println(((Person)o).age);
        return this.age - ((Person)o).age;
    }
}
