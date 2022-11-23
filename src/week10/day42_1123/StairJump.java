package week10.day42_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 코드업 1856 : [기초-재귀함수] 계단 뛰어 오르기
 */
public class StairJump {

    public static int printStairJump(int num) {

        if(num == 0) return 0;
        if(num == 1) return 1;
        if(num == 2) return 1 + printStairJump(1);
        if(num == 3) return 1 + printStairJump(1) + printStairJump(2);
        return printStairJump(num - 1) + printStairJump(num - 2) + printStairJump(num - 3);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(printStairJump(n));
    }
}
