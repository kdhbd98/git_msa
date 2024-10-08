import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        // 4행 3열
        int num[][] = new int[4][3];

        System.out.println(num.length);
        System.out.println(num[0].length);
        System.out.println(num[1].length);
        System.out.println(num[2].length);
        System.out.println(num[3].length);

        int a = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = a++;
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println(a);

        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println(Arrays.toString(num[3]));

        /*
           2차원 배열은 1차원 배열의 묶음이고,
           3차원 배열은 2차원 배열의 묶음이다.
         */

        Arrays.fill(num[0], 20);
        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println(Arrays.toString(num[3]));

    }
}
