package week8.day31_1107;


import java.util.Arrays;
import java.util.PriorityQueue;

public class Dividable2 {
    public static int[] solution(int[] arr, int divisor) {

        PriorityQueue<Integer> list = new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) list.add(-1);

        int[] answer = new int[list.size()];
        int size = 0;
        while (!list.isEmpty()) {
            answer[size++] = list.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5,9,7,10},5)));
        System.out.println(Arrays.toString(solution(new int[]{2,36,1,3},1)));
        System.out.println(Arrays.toString(solution(new int[]{3,2,6},10)));
    }
}
