package ex03;

public class Ex04 {
	
	public static void main(String[] args) {
		// 강제 형변환
		// int 4byte short 2byte
		// 8bit -> 1byte
		int num1= 1025468325;
		
		// short 32000 -> 데이터 소실 발생
		short num2 = (short) num1;
		
		// 자동 형변환
		// 반대 -> 자동 형변환(데이터 소실 없음)
 		short num3 = 20; 
		int num4= num3;
	}

}
