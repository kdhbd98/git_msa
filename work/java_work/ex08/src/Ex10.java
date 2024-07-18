/*
   2. 피보나치 수열 은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다

    예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 된다.
    (0),1,1,2,3,5,8,13,21,... 이렇게 진행된다
    피보나치수열의 10 번째 수는 무엇인지 계산하는 프로그램을 완성하시오
 */

public class Ex10 {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        for (; i < 10 ; i++) {
            for (; j <10 ; j++) {
                int sum = i+j;
                System.out.println(sum);
            }
        }
    }
}
