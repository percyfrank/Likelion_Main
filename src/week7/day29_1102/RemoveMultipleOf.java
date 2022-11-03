package week7.day29_1102;

import java.util.Arrays;

public class RemoveMultipleOf {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime,true);
        // 0과 1은 소수 아님
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i < Math.sqrt(n) + 1 ; i++) {
            if(isPrime[i]) {
                int j = 2;
                while(i * j <= n) {
                    isPrime[i * j] = false;
                    j++;
                }
            }
        }

        for(boolean flag : isPrime) {
            if(flag)
                answer++;
        }

        return answer;
    }
        public static void main(String[] args) {
        RemoveMultipleOf rmo = new RemoveMultipleOf();
        System.out.println(rmo.solution(13));
    }
}
