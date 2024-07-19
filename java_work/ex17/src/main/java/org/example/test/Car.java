package org.example.test;

public class Car {
    int gasolineGauge;

    public Car(int gasolineGauge) {
        this.gasolineGauge = gasolineGauge;
    }
}

class HybridCar extends Car {
    int electricGauge;

    public HybridCar(int gasolineGauge, int electricGauge) {
        super(gasolineGauge); // 상위 클래스의 생성자 호출
        this.electricGauge = electricGauge;
    }
}

class HybridWaterCar extends HybridCar {
    int waterGauge;

    public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
        super(gasolineGauge, electricGauge); // 상위 클래스의 생성자 호출
        this.waterGauge = waterGauge;
    }

    public void showCurrentGauge() {
        System.out.println("잔여 가솔린 " + gasolineGauge);
        System.out.println("잔여 전기량 " + electricGauge);
        System.out.println("잔여 워터량 " + waterGauge);
    }
}

