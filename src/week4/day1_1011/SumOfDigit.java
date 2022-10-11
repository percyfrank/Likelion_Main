package week4.day1_1011;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfDigit {

    public static int solution(int n) {

        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = solution(Integer.parseInt(br.readLine()));
        System.out.println(result);
    }

}
