package assignment;

import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num1 = scan.nextInt();
		System.out.println(num1);
		if(num1<0){
			System.out.println("음수");
		}else if (num1>0) {
			System.out.println("양수");
		}else {
			System.out.println("0");
		}
		
	}

}
