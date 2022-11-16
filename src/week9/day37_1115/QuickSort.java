package week9.day37_1115;

import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] arr,int start, int end) {

        if(start >= end) return arr;

        int pivot = start;
        int left = start + 1;
        int right = end;

        // 핵심은 피벗을 기준으로 왼쪽에서부턴 큰 값을, 오른쪽에서부턴 작은 값을 찾는 것
        while(left <= right)  {
            while(left <= end && arr[left] <= arr[pivot]) left++;           // 피벗보다 큰 값을 찾을 때까지 반복
            while(right > start && arr[right] >= arr[pivot]) right--;       // 피벗보다 작은 값을 찾을 때까지 반복
            if(left > right) {                                              // 인덱스가 엇갈리면 작은 값인 right와 pivot 교체
                int tmp = arr[right];
                arr[right] = arr[pivot];
                arr[pivot] = tmp;
            } else {                                                        // 엇갈리지 않으면 left와 right를 교체
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }
        }
        quickSort(arr, start,right-1);                                  // 피벗을 기준으로 왼쪽 부분 정렬
        quickSort(arr, right+1,end);                                    // 피벗을 기준으로 오른쪽 부분 정렬
        return arr;
    }

    public static void main(String[] args) {
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory + " bytes");

        long startTime = System.nanoTime();
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        int[] answer = quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(answer));

        long finishTime = System.nanoTime();
        long elapsedTime = finishTime - startTime;
        System.out.println("startTime(ns) : " + startTime);
        System.out.println("finishTime(ns) : " + finishTime);
        System.out.println("elapsedTime(ns) : " + elapsedTime);

        Runtime.getRuntime().gc();
        long usedMemory1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory1 + " bytes");

    }
}
