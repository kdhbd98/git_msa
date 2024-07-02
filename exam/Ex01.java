import java.util.Scanner;

public class Ex01 {

  // shift + delete 한 줄 삭제
  public static void main(String[] args) {
  // Scanner scan = new Scanner(System.in);
    double doubleValue = 10.987;
    int intValue = (int) (doubleValue*100);
    System.out.println(intValue);
    System.out.println(intValue/(double)100);
  }
  // 강제 형변환 활용하기!
  // Scanner: 입력받기 위해 사용하는 문법
  // 먼저 double 값을 받은 상태로 100배로 만들어주기
  // 그 다음 100배로 만든 값을 정수로 만들어주기
  // 그러면 소수 넷째 자리까지 정수로 변환됨
  // 그 상태로 다시 100으로 나누어주면 소수 둘째 자리까지 결과 도출  

}