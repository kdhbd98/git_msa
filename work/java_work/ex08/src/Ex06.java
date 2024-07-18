/*
1. 2의 n승을 구하는 함수를 재귀적으로 구현해 보자.
    그리고 그에 따른 적절한 함수를 구현해 보자.
 */

import java.util.Scanner;

public class Ex06 {

    public static int fact(int i) {

        if (i == 0) {
            return 1;
        } else {
            return 2 * fact(i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int result = fact(i);
        System.out.println("2의 " + i + "제곱은 " + result + "입니다.");
    }
}
