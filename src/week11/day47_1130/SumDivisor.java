package week11.day47_1130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDivisor {

    public int solution(int n) {

        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        SumDivisor sumDivisor = new SumDivisor();
        System.out.println(sumDivisor.solution(n));

    }
}
