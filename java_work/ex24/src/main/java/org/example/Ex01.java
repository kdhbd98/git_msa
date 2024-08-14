package org.example;

import org.example.Box.Box;
import org.example.Box.BoxFactory;
import org.example.T.AA;
import org.example.T.BB;
import org.example.T.CC;

public class Ex01 {

    public static void main(String[] args) {

        BoxFactory.peekBox4(new Box<AA>(new AA()));
        BoxFactory.peekBox4(new Box<BB>(new BB()));
        BoxFactory.peekBox4(new Box<CC>(new CC()));

        // 이거는 안됨
//        BoxFactory.peekBox4(new Box<Object>(new Object()));

        BoxFactory.peekBox5(new Box<Object>(new Object()));
        BoxFactory.peekBox5(new Box<AA>(new AA()));
        BoxFactory.peekBox5(new Box<BB>(new BB()));

        // 이거는 안되야 하는데...
//        BoxFactory.peekBox5(new Box<CC>(new CC()));

    }
}

