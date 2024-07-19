package org.example.phone;

public class SmartPhone extends MobilePhone {
    private String androidVer;

    public SmartPhone(String aver, int number) {
        super(number);
        this.androidVer = aver;
    }

    @Override // override = 재정의
    public void show() {
        super.show(); // 부모 함수에 있는 것도 호출
        System.out.println("androidVer = " + androidVer);
    }
}
