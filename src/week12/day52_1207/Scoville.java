package week12.day52_1207;

import java.awt.print.Pageable;
import java.util.PriorityQueue;

public class Scoville {
    public int solution(int[] scoville, int K) {

        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

//        for (int i = 1; i < scoville.length; i++) {
//            if(pq.peek() >= K) break;
//            int a = pq.poll();
//            int b = pq.poll();
//            pq.add(a + 2 * b);
//            answer++;
//
//        }

        while(pq.peek() < K) {
            if(pq.size() < 2) {
                answer = -1;
                break;
            }
            int a = pq.poll();
            int b = pq.poll();
            pq.add(a + 2 * b);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scoville sc = new Scoville();
        int solution = sc.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        int solution1 = sc.solution(new int[]{1, 2, 3}, 11);

        System.out.println(solution);
        System.out.println(solution1);
    }

}
