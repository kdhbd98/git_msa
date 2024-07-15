package assignment;

import java.util.Scanner;

public class assignment3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = scan.nextInt();
		System.out.println((int)num/100 * 100);
	}

}
