package week9.day38_1116;

import java.util.Arrays;

public class QuickSortWIthArray {

    public static int[] sort(int[] arr, int start, int end) {

        int left = start;                   // 20부터 오른쪽으로
        int right = end;                    // 45부터 왼쪽으로
        int pivot = arr[(left + end) / 2];    // 피벗을 arr의 중간값

        while(left <= right) {
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;

            if(left <= right) {
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
                left++;
                right--;
            }
            System.out.println(Arrays.toString(arr));
        }
        if(start < right) sort(arr, start, right);
        if(left < end) sort(arr, left, end);

        return arr;
    }


    public static void main(String[] args) {
        var arr = new int[]{20, 60, 5, 19, 40, 50, 5, 45};
//        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};

        sort(arr, 0, arr.length - 1);

    }

}
