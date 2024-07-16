/*
   10진수 입력받아 2진수 출력
 */

public class Main {
    public static void main(String[] args) {
        Exam exam = new Exam();
        int result = exam.inputNumber();
        System.out.println("main result = " + result);

        int share, remain;

        share = result / 2;
        remain = result % 2;

        System.out.println("몫 = " + share);
        System.out.println("나머지 = " + remain);

        String remains = "" + remain;

        while (true) {

            remain = share % 2;
            share = share / 2;
            remains = remain + remains;

            System.out.println("몫 = " + share);
            System.out.println("나머지 = " + remain);
            System.out.println("나머지들 = " + remains);

            if (share < 2) {
                if (share !=0){
                    remains = share + remains;
                }
                remains = share + remains;
                System.out.println("나머지들 = "+remains);
                break;
            }

            System.out.println("몫 = " + share);
            System.out.println("나머지 = " + remain);
        }
    }
}