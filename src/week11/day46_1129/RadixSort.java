package week11.day46_1129;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;

public class RadixSort {

    /**
     * 중복이 제거된 자릿수 구하기
     */
    public static int[] getMax(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // 중복이 제거된 자릿수 구하기
            if(arr[i] == 0) set.add(1);
            else set.add((int) (Math.log10(arr[i]) + 1));
        }

        int[] answer = new int[set.size()];
        int idx = 0;
        for (Integer num : set) {
            answer[idx++] = num;
        }

        Arrays.sort(answer);
        return answer;
    }

    /**
     * 작은 자리수부터 정렬
     */
    public static void sort(int[] arr, int digit) {
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        for (int i = 0; i < arr.length; i++) {
            int divisor = (int) Math.pow(10, digit - 1);
            queueArr[Math.floorDiv(arr[i], divisor) % 10].add(arr[i]);
        }

        int idx = 0;

        for (int i = 0; i < queueArr.length; i++) {
            while(!queueArr[i].isEmpty()) {
                arr[idx++] = queueArr[i].poll();
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {

        int[] arr = new int[]{7, 4, 5, 9, 1, 0, 20};
        int[] max = getMax(arr);
        System.out.println(Arrays.toString(max));
//        System.out.println(Arrays.toString(arr));

        for (int i : max) {
            sort(arr, i);
        }


    }
}
