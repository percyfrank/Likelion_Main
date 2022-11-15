package week9.day37_1115;

import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] arr,int start, int end) {

        if(start >= end) return arr;

        int pivot = start;
        int left = start + 1;
        int right = end;

        while(left <= right)  {
            while(left <= end && arr[left] <= arr[pivot]) left++;
            while(right > start && arr[right] >= arr[pivot]) right--;
            if(left > right) {
                int tmp = arr[right];
                arr[right] = arr[pivot];
                arr[pivot] = tmp;
            } else {
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }
        }
        quickSort(arr, start,right-1);
        quickSort(arr, right+1,end);
        return arr;
    }

    public static void main(String[] args) {
//        var arr = new int[]{5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        int[] answer = quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(answer));

    }
}
