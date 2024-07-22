package org.example;

interface Printable{
    public void print();
    public void doA();
}

public class Print implements Printable {

    @Override
    public void print() {
        System.out.println("printed");
    }

    @Override
    public void doA() {

    }

    public static void main(String[] args) {
        Print print = new Print();
        print.print();
    }
}
