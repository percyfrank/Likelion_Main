package week10.day42_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 코드업 1852 : [기초-재귀함수] 재귀로 1부터 n까지 한 줄로 출력하기
 */
public class Line {

    public static void printLine(int num) {

        if(num == 0) return;
        printLine(num-1);
        System.out.print(num + " ");

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        printLine(n);
    }
}
