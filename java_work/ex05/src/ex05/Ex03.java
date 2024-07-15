package ex05;

public class Ex03 {

	public static void main(String[] args) {
		int num1 = 10;
		/*
		 * 브레이크포인트...더블클릭 벌레모양으로 실행 f6 한줄씩 진행 f8 종료
		 */
		// num++
		// num = num + 1
		// num += 1

		// ctrl + d 여러 줄 삭제

		System.out.println(num1++); // 출력 후 1 대입 (10 출력 후 더하기 1)
		System.out.println(++num1); // 1 대입 후 출력 (값이 11이 된 후 1 대입, 그 값 출력)
		System.out.println(num1);

		System.out.println(num1--); // 출력 후 1 대입 (10 출력 후 더하기 1)
		System.out.println(--num1); // 1 대입 후 출력 (값이 11이 된 후 1 대입, 그 값 출력)
		System.out.println(num1);

		for (int i = 0; i < 10; i++) {
			// for : ~동안, i : 초기값, i < 10 : 조건 , ++i / i++ / i+=1 / i=i+1 : 1씩 증가
			System.out.println(i);
			System.out.println("ㅎㅎㅎ");
			System.out.println(i + i);
			// println => 결과 하나 나오고 다음값은 다른 줄에 나옴
			// print => 결과가 한 줄에 모두 나옴
		}
	}

}
