package org.example.assignment;

public class test01 {
        public static int minValue(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("배열이 비어있거나 null입니다.");
            }

            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }

        public static int maxValue(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("배열이 비어있거나 null입니다.");
            }

            int max = arr[0];
            for (int value : arr) {
                if (value > max) {
                    max = value;
                }
            }
            return max;
        }

        public static void main(String[] args) {
            int[] numbers = {10,20,5,9,35,100};

            int min = minValue(numbers);
            int max = maxValue(numbers);

            System.out.println("최솟값: " + min);
            System.out.println("최댓값: " + max);
        }
    }
