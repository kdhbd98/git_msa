/*
   CalSecond
   초를 입력받는 함수
   int를 넘겨주면 String을 반환하는 함수
   toString은 생략된 문법이다.
 */
package aa;

import java.util.Scanner;

public class CalSecond {

    public int inputNumber(){
        System.out.println("초입력: ");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

/*
   int를 넘겨주면 String을 변환하는 함수
   21747 -> 6시간 2분 27초 (문자열)
   1시간 3600초 -> 60 * 60
   1분 60초
 */
    public String calculate(int second) {
        int hour = second / 3600 ;
        int min = (second%3600)/60;
        int sec = (second%3600)%60;
        return hour + "시간" + min + "분" + sec + "초";
    }
}
