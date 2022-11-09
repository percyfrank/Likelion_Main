package week8.day33_1109;

import java.util.Arrays;

public class Insertionsort {

    public static int[] sortDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max_idx = i;

            int tmp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[max_idx] < arr[j]) {
                    max_idx = j;
                }
            }
            tmp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public static int[] sortAscending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;

            int tmp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min_idx] > arr[j]) {
                    min_idx = j;
                }
            }
            tmp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        System.out.println(Arrays.toString(sortAscending(arr)));    // 오름차순
        System.out.println(Arrays.toString(sortDescending(arr)));   // 내림차순

    }
}
