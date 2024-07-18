package org.example.assignment;

public class test03 {
    public static void rotateArray(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int lastRowIndex = arr.length - 1; // 마지막 행 인덱스
        int[] lastRow = arr[lastRowIndex];
        for (int i = lastRowIndex; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastRow;
    }

    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("변경 전 배열:");
        printArray(numbers);

        rotateArray(numbers);

        System.out.println("변경 후 배열:");
        printArray(numbers);
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
