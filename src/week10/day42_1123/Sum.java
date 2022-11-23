package week10.day42_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 코드업 1853 : [기초-재귀함수] 재귀로 1부터 n까지 합 리턴하기
 */
public class Sum {
    public static int printSum(int num) {

        if(num == 0) return 0;
        return num + printSum(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(printSum(n));
    }
}
