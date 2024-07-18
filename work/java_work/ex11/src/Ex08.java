import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int odd = 0;
        int even = 9;

        System.out.println("10개의 정수를 입력하세요:");
        for (int i = 0; i < 10; i++) {
            int input = scanner.nextInt();
            if (input % 2 != 0) {
                numbers[odd++] = input;
            } else {
                numbers[even--] = input;
            }
        }

        System.out.println("결과 배열:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

    }
}


