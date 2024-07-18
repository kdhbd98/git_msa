import java.lang.Math;

import aa.bb.CC;

public class Ex02 {
    public static void main(String[] args) {
        CC.doA();
        // 0<x<1
        // 0.0000001 <= x <= 0.9999999
        // 0.0000006 <= x <= 5.9999994
        // 0 <= x <= 0
        int value = (int) (Math.random()*6+1);
        System.out.println("value = " + value);
    }
}
