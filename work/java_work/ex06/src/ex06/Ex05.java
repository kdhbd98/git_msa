package ex06;

public class Ex05 {
	
	// 보낸 구구단 호출하는 메서드 2 3
	private static void aa(int num1) {
		System.out.println("aa");
		for (int i = 1; i < 10; i++) {
			System.out.println(num1 * i);
		}
	}
	
	// 두 수를 받아서 최소 공배수 출력하는 메서드
	// num2로 나누었을 때 나머지가 0
    // 그리고 num3로 나누었을 때 나머지가 0
	private static void bb(int num2, int num3) {
		System.out.println("bb");
		int num = 0;
		while(num<50) {
			num++;
			if(num%num2==0 && num%num3==0) {
				System.out.println("최소공배수는 = "+num);
			    break;}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		aa(7);
		bb(3,5);
		System.out.println("프로그램 끝");
	}

}
