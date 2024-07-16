/*
   public : 어디서든 접근 가능
   public -> protected -> default -> private
   오른쪽으로 갈수록 접근이 제한됨
   private 는 클래스 내부에서만 접근 가능
 */

import aa.AA;

public class Ex02 {
    public static void main(String[] args) {
        AA aa = new AA();
//        aa.doA();
    }
}
