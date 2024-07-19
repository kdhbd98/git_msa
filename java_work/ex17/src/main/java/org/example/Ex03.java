package org.example;

import org.example.phone.MobilePhone;
import org.example.phone.SmartPhone;

public class Ex03 {
    /*
       부모 클래스에 있는 메소드는 상속되며
       자식 클래스에 동일한 이름의 메소드가 있으면
       오버라이딩(재정의) 된다.
       오버플로우/오버로딩/오버라이딩 구분하기
       라이브러리/프레임워크 구분하기
     */
    public static void main(String[] args) {
        MobilePhone mobilePhone = new SmartPhone("6.0", 12345678);
        mobilePhone.show();
    }
}
