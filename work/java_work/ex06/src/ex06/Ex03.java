package ex06;

public class Ex03 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			// 2,4...이렇게 나오게 하려면 i+=2 입력
			for (int j = 0; j < 10; j++) {
				if(j==4)
					continue;
				System.out.println(i+" * "+j+" = "+i*j);
			}
			
		}
	}

}
