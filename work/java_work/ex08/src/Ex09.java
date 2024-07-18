import java.util.Scanner;

/*
   4. 두 개의 정수를 입력받아서 최대 공약수(GCD)를 구하는 프로그램을 작성해 보자.
 */
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요");
        int a = scanner.nextInt();
        System.out.println("두 번째 정수를 입력하세요");
        int b = scanner.nextInt();

        int c = 2;

        if (a%b == 0 && a%c == 0)
            System.out.println("두 수의 최대 공약수는 "+ );
        else
            System.out.println("두 수의 최대 공약수는 "+ "1");
    }
}