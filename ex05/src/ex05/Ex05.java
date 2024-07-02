package ex05;

public class Ex05 {
	
	// ctrl + z 뒤로 가기
	// ctrl + y 앞으로 가기
	
	public static void main(String[] args) {
		
		// 괄호, 세미콜론이 범위 지정하는 역할
		// 가급적이면 앞에서 변수 선언할 것
		// 변수는 괄호 안에서만 적용됨
		// class > main > if > else (적용 범위)
		
		int a = 10;
		int b = 20;

		if (a > b) {
			System.out.println("true 실행");
		} else {
			System.out.println("많이 출력");
			System.out.println("false 실행");

			int c = 30;
			System.out.println(c);
		}
	}

}
