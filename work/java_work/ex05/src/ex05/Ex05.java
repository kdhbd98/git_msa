package ex05;

public class Ex05 {
	public static void main(String[] args) {
		
		int n = 3;
		//home end shift 화살표 => 블럭지정
		switch (n) {
		case 1: 
			System.out.println("n은 1입니다.");
			break;
		case 2: 
			System.out.println("n은 2입니다.");
			break;
		case 3: 
			System.out.println("n은 3입니다.");
			break;
		case 4: 
			System.out.println("n은 4입니다.");
			break;
		default:
			break;
		}
		System.out.println("종료합니다.");
		
		if (n==1) {
			System.out.println("n은 1입니다.");
		}
		else if (2 <= n && n <=4) {
			System.out.println("n은 2입니다.");
			System.out.println("n은 3입니다.");
			System.out.println("n은 4입니다.");
		}
		else {
			System.out.println("기본");
		}
		System.out.println("종료됩니다.");
	}

}
// n==2||n==3||n==4 or 2 <= n && n <=4 => 2보다 크고 4보다 작다
