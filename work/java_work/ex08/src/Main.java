/*
   i=0일 때 j가 0~0이하까지 => 1번
   i=1일 때 j가 0~1이하까지 => 2번
   i=2일 때 j가 0~2이하까지 => 3번
   i=3일 때 j가 0~3이하까지 => 0,1,2,3,4번
   ...
 */
//        for (int i = 1; i < 10; i++) {
//            System.out.println();
//            for (int j = 0; j <= i; j++) {
//                System.out.println("*");  // 줄 안 바꾸고 * 출력
//            }
//            System.out.println();  // 줄 바꾼 후 출력
//        }
//    }
//}
//      * while 문으로 바꾸었을 때
public class Main {
    public static void doA() {
        int i = 0;
        while (i < 10) {
            i++;
            int j = 0;
            while (j <= i) {
                j++;
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        doA();
        doA();
        doA();
    }
}

