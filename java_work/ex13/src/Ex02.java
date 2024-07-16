import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int nums[][] = new int[3][3];

        Arrays.fill(nums[0], 10);
        Arrays.fill(nums[1], 20);
        Arrays.fill(nums[2], 30);

        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));

        System.out.println();
        // 기존 배열에 저장되어 있는 메모리가 지워지지 않음
        // temp 함수 없을 시 30이란 값이 들어간 3열이 아예 지워짐
        int temp[] = nums [2];
        nums [2] = nums [0];
        nums [0] = temp;

        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));
    }
}
