import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Fact {
    public int fact(int num) {
        System.out.println("여기오나 " + num);
        // 메서드는 반환값을 적게 되면 반환값이 무조건 있어야 한다.
        if (num > 0)
            return 2 * fact(num - 1);
        // 2 * fact(2)
        // 2 * 2 * fact(1)
        // 2 * 2 * 2 * fact(0)
        // 2 * 2 * 2 * 1
        else
            return 1;
    }
}

public class Main {
    public static void main(String[] args) {
        /*
           String -> int    Integer.parseInt
           int -> String    10 + ""
           문자열 입력 scan. nextLine
           숫자 입력 scan. nextInt
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 승 구할래?");

        String a = scanner.nextLine();
        int num = Integer.parseInt(a); // 외우기!!!

        Fact fact = new Fact();
        int result = fact.fact(num);
        System.out.println("result = " + result);

//        System.out.println(a);
//        System.out.println(num);
//        int num = scanner.nextInt()


    }
}