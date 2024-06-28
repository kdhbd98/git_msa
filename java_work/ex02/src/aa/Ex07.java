package aa;

public class Ex07 {
	
	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		System.out.println(MAX_SIZE);
		
//		MAX_SIZE = 200;
//		정수는 무조건 int형으로 인식하기로 약속했음
//		실수는 double 형으로 인식하기로 약속했음
		
		final double AA = 200;
		System.out.println(AA);
		
		final String c ="변경불가";
		System.out.println(c);
		
		float result = (float) (3.3+4.5);
		System.out.println(result);
		
		System.out.printf("정수는 %d 실수는 %f \n", 10,20.33);
		
//		[자주 쓰임] Escape Sequences(이스케이프 상용문자)
//		긴 숫자 줄 바꾸기 => 따옴표 맨 끝에 \n 집어넣기
//		긴 숫자를 표현하려면 숫자 맨 뒤에 L 붙이기
//		double형 명시하려면 d 또는 D 삽입
//		float형 명시하려면 f 또는 F 삽입
//		3.4e-3 => 3.4*10의 -3제곱

		System.out.println(32135435432321L);
	}

}
