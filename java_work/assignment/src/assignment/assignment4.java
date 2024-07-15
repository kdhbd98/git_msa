package assignment;

import java.util.Scanner;

public class assignment4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("온도 입력");
		
		int F = scan.nextInt();
		int num = (int) ((F-32)/1.8 * 100);
		float C= (float) num / 100;
		System.out.println("F = " + F);
		System.out.println("C = " + C);
	}

}
