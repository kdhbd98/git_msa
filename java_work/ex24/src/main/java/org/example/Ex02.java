package org.example;

import org.example.Box.Box;
import org.example.Box.BoxFactory;
import org.example.T.AA;
import org.example.T.BB;

public class Ex02 {

    public static void main(String[] args) {
        BoxFactory.peekBox6(new Box<>(new AA()));
        BoxFactory.peekBox7(new Box<>(new AA()));

        BB bb = BoxFactory.<BB>getMyBox1(new Box<>(new BB()));
        AA aa = BoxFactory.<AA>getMyBox1(new Box<>(new AA()));

        BB bb1 = BoxFactory.getMyBox1(new Box<>(new BB()));
        AA aa1 = BoxFactory.getMyBox1(new Box<>(new AA()));
    }

}