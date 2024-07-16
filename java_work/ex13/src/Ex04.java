/*
   return 함수를 사용하는 경우
   1. 값을 반환할 때
   2. 메서드(함수)를 종료할 때
 */

public class Ex04 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);

//      반지름 값에 음수를 넣지 못하게 만드는 방법
//
        circle1.setRad(-10);
        System.out.println(circle1.getRad());
        System.out.println();
    }
}
