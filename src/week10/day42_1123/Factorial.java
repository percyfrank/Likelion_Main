package week10.day42_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 코드업 1912번 - (재귀함수) 팩토리얼 계산
 */
public class Factorial {
    public static int printFactorial(int num) {

        if(num == 0) return 1;
        return num * printFactorial(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(printFactorial(n));
    }
}
