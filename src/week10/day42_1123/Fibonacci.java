package week10.day42_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 코드업 1855번 : [기초-재귀함수] 재귀로 n번째 피보나치 수 리턴하기
 */
public class Fibonacci {

    public static long printFibo(long num) {

        if(num == 1 || num == 2) return 1;
        return printFibo(num - 1) + printFibo(num - 2);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        System.out.println(printFibo(n));
    }
}
