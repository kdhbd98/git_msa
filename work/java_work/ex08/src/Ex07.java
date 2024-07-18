import java.util.Scanner;

/*  2. 프로그램 사용자로부터 초(second)를 입력받은 후에,
    이를 [시, 분, 초]의 형태로 출력하는 프로그램을 작성해 보자.
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int hour = total / 3600;
        int minute = total % 3600 / 60;
        int second = (total % 3600 % 60);
        System.out.println("지금은 " + hour + "시 " + minute + "분 " + second + "초 " + "입니다.");
    }
}
