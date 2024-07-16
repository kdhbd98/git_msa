import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int length = str.length();

        for (int i = 0; i < length; i++) {
            System.out.println(str.charAt(i));
        }
    }
}
