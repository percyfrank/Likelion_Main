package week4.day4_1014;

import java.util.Arrays;

public class InsertionSort01 {
    
    public int[] sort(int[] arr) {
        int i = 1;
        int tmp = 0;
        if(arr[i] < arr[i-1]) {
            tmp = arr[i];
            arr[i] = arr[i - 1];
            arr[i-1] = tmp;
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
