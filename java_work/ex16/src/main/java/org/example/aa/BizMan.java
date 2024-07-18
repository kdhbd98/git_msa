package org.example.aa;

public class BizMan extends Man {
    private String company;
    private String position;

    public BizMan(String name, String company, String position) {
        /*
           super(name); => 기본 생성자를 호출해주는 것
           기본 생성자에서 상위 클래스의 생성자를 호출 => 생략 가능
         */
        this.company = company;
        this.position = position;
    }

    public void showInfo() {
        System.out.println("company = " + company);
        System.out.println("position = " + position);
        tellInfo();

    }
}
