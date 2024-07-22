package org.example.friend;
import lombok.ToString;
/*
   <배열>
   클래스 다형성 문법으로
   Friend 클래스 배열로
   친구관리를 할 수 있는 프로그램
   부모참조변수는 자식 인스턴스를 참조할 수 있다.

   <Override>
   @Override : 부모 클래스에서 존재하는 매서드를 재정의할 때만 사용할 수 있다(생략 가능).
   toString : 매서드

   final 은 변수 / 상수
   매서드는 오버라이드 불가
   클래스는 상속 불가
 */
@ToString
public class Friend {
    private String name;
    private String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("이름 = " + name);
        System.out.println("연락처 = " + phone);
    }
}
