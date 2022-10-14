package week4.day4_1014;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            int idx = i;
            int tmp = 0;
            for(int j = 0; j < i; j++) {
                if(arr[idx] < arr[j]) {
                    tmp = arr[idx];
                    arr[idx] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort01 is = new InsertionSort01();
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
