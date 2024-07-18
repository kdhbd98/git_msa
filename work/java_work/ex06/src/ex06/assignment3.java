package ex06;

public class assignment3 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 0;
		for (int i = 1; sum < 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			} else {
				sum -= i;
			}
			n = i;
		}
		System.out.println(n);
	}
}
