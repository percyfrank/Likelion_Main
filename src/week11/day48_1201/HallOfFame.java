package week11.day48_1201;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 프로그래머스 - 명예의 전당(1)
 *
 * 가수들의 점수를 k일차 전까지는 우선순위 큐에 넣으면서 최솟값을 peek하고,
 * k일차 부터는 우선순위 큐에 들어올 점수가 기존에 들어가 있는 점수의 최솟값보다 크면 기존의 최솟값을 제거한 뒤 점수를 추가해 peek하고,
 * 그렇지 않다면 기존의 최솟값을 peek한다.
 */
public class HallOfFame {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            if(i < k) {
                pq.add(score[i]);
                answer[i] = pq.peek();
//                System.out.println(pq.peek());
            }
            else if(i >= k) {
                if(pq.peek() <= score[i]) {
                    pq.poll();
                    pq.add(score[i]);
                    answer[i] = pq.peek();
//                    System.out.println(pq.peek());
                } else {
                    answer[i] = pq.peek();
//                    System.out.println(pq.peek());
                }
            }
        }
        return answer;
        
    }


    public static void main(String[] args) {

        HallOfFame hof = new HallOfFame();
        int[] answer = hof.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        System.out.println(Arrays.toString(answer));

    }

}
