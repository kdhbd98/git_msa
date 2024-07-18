package ex06;

import java.util.Iterator;

public class assignment1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int num = 0; num <= 20; num++) {
			if (num % 2 != 0 && num % 3 != 0)
				sum = sum + num;
		}		System.out.println(sum);
	}
}