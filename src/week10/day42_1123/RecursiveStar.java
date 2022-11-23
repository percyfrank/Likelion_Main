package week10.day42_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 코드업 1851번 - 재귀로 * n개 한 줄로 출력하기
 */
public class RecursiveStar {
    public static void printStar(int num) {
        if(num == 0) return;
        System.out.print("*");
        printStar(num-1);
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printStar(n);
    }
}
