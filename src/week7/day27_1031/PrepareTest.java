package week7.day27_1031;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrepareTest {
    /**
     * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
     * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
     * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
     * <p>
     * 1 2 3 4 5
     */

    static int[][] pattern = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

    public int calculate(int[] answers, int[] pattern) {
        int cnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == pattern[i % pattern.length]) {
                cnt++;
            }
        }
        return cnt;
    }

    public int[] solution(int[] answers) {

        int maxcnt = 0;
        int cnt[] = new int[3];
        for (int i = 0; i < pattern.length; i++) {
            if(calculate(answers,pattern[i]) >= maxcnt) {
                maxcnt = calculate(answers, pattern[i]);
                cnt[i] = maxcnt;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if(maxcnt == cnt[i]) list.add(i+1);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] answers = {1, 2, 3, 4, 5};
//        int[] answers = {1, 3, 2, 4, 2};
        PrepareTest pt = new PrepareTest();

        System.out.println(Arrays.toString(pt.solution(answers)));
    }


}
