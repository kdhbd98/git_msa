public class Ex03 {
    public static void main(String[] args) {
        int a[] = new int[10]; // 변수 10개 선언
        int c[] = a;
        int b[] = {1, 2, 3, 4};

        System.out.println("a.length = " + a.length);

        /*
           int 배열은 값을 넣지 않을 시 0으로 초기화
         */
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[9]);
        /*
           0부터 시작. 0~9까지 가능
           10이 넘어가는 수를 쓰는 순간 오류 발생
         */

        a[0] = 20;
        System.out.println(a[0]);

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
    }
}
