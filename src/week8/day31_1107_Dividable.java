package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day31_1107_Dividable {
    public static int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        if(list.size() == 0) list.add(-1);
        else Collections.sort(list);

        int[] answer = new int[list.size()];
        int size = 0;
        for (Integer temp : list) {
            answer[size++] = temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5,9,7,10},5)));
        System.out.println(Arrays.toString(solution(new int[]{2,36,1,3},1)));
        System.out.println(Arrays.toString(solution(new int[]{3,2,6},10)));
    }
}
