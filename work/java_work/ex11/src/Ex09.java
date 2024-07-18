import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = new Integer[7];
        System.out.println("7개의 정수를 입력하세요:");
        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("내림차순 정렬: " + Arrays.toString(numbers));

        scanner.close();
    }
}
