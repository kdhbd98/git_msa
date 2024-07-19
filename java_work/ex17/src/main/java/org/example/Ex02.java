package org.example;

import org.example.test.*;

/*
    부모 클래스에 자식 클래스를 담을 수 있다.
    자식 클래스를 생성했을 때 부모 클래스를 참조할 수 있다.
 */

public class Ex02 {
    public static void main(String[] args) {
        BB[] bary = new BB[10];
        CC[] cary = new CC[10];

        AA[] ary1 = new BB[10];
        AA[] ary2 = new CC[10];

        AA a1 = new BB();
    }
}
