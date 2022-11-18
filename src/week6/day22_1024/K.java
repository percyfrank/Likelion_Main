package week6.day22_1024;

import java.util.Arrays;
import java.util.PriorityQueue;

public class K {

    static int[] array;

    public int[] solution(int[] array, int[][] commands) {
        this.array = array;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }

    public int getKthNum(int[] command) {
        int frIdx = command[0]; // 0번 from
        int toIdx = command[1]; // 1번 to
        int nth = command[2]; // n번째

        int result = 0; // 문제에 0이 안나온다고 했기 때문에 3벌식
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx-1; i < toIdx ; i++) { // 1번부터 시작하니 -1
            pq.add(array[i]);
        }
//        pq.forEach(item -> System.out.println(item));

        for (int i = 0; i < nth; i++) {
            result = pq.poll(); // stack의 pop과 비슷
        }
        return result;
    }


//    static class Solution {
//        public int[] solution(int[] array, int[][] commands) {
//            int[] answer = new int[commands.length];
//
//            int[] array1 = new int[array.length];
//            for(int i = 0; i < commands.length; i++) {
//                array1 = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
//                Arrays.sort(array1);
//                answer[i] = array1[commands[i][2]-1];
//            }
//
//            return answer;
//        }
//    }
//
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        K k = new K();
        System.out.println(Arrays.toString(k.solution(array, commands)));
//        Solution solution = new Solution();
//        int[] answer = solution.solution(array, commands);
//        System.out.println(Arrays.toString(answer));

    }

}
