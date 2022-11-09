package week8.day33_1109;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Insertionsort {

    public static int[] sort(int[] arr, BiFunction<Integer,Integer,Boolean> stmt) {

        for (int i = 0; i < arr.length - 1; i++) {
            int swapIdx = i;

            int tmp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(stmt.apply(arr[swapIdx],arr[j])) {
                    swapIdx = j;
                }
            }
            tmp = arr[swapIdx];
            arr[swapIdx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        System.out.println(Arrays.toString(sort(arr,(a,b) -> a > b))); // 오름차순
        System.out.println(Arrays.toString(sort(arr,(a,b) -> a < b))); // 내림차순

    }
}
