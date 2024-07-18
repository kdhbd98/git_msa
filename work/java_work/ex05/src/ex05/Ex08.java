package ex05;

import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		/* i = 0 일 때 정해라 
		 * i = 1 일 때 정해라
		 * i = 2 일 때 정해라
		 * i = 3 일 때 정해라
		 * i = 4 일 때 정해라
		 */
	    int i = 0;
		for (; i < 5 ; i+=2) {
			System.out.println("I LOVE JAVA "+i);
		} // -> 여기서 이미 6까지 계산됨(출력은 안 됨)
		/*  int i = 1; 지정 안 해도 됨 
		 *  for (int i = 0; i < 5; i++) {
		    System.out.println("I LOVE JAVA "+i);
		    }
		 */
		System.out.println(i); // ->  여기서 6출력
	}

}
