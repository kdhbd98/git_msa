package org.example.aa;

public class Man {
    private String name;
    public Man(){}
/*
    public Man(){} => 기본 생성자
    기본 생성자는 다른 생성자를 생성하게 될 시 생략 불가.
    * 상속관계에서는 부모 클래스에 해당하는 생성자가
    반드시 호출돼야 한다!! *
    상속관계에서는 부모 클래스에 해당하는
    기본 생성자를 호출하는 것이 있고,
    이에 해당하는 것이 생략돼있다.
    만약 부모 클래스에 기본 생성자가 선언돼있지 않을 경우
    다른 생성자 호출을 통해 부모 클래스 생성자를 호출할 수 있다.
 */
    // 다른 생략자
    public Man(String name){
        this.name = name;
    }
    public void tellInfo(){
        System.out.println("name = "+name);
    }
}
