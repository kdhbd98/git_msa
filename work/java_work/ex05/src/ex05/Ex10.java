package ex05;

public class Ex10 {
	public static void main(String[] args) {
		// 3,4의 최소공배수
		// 3과 4로 나누었을 때 0으로 나누어 떨어지면?
		// break -> switch while for 구문 탈출하게 됨

		for (int num = 1; num < 100; num++) {
//			System.out.println("num= " + num);

			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println("num= " + num);
				break;
			}
		}
	}
}
