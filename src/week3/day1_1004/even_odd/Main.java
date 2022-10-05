package week3.day1_1004.even_odd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer sb = new StringBuffer();
        String[] arr = new String[2];
        arr = br.readLine().split(" ");

        String a = Integer.parseInt(arr[0]) % 2 == 0 ? "짝수" : "홀수";
        String b = Integer.parseInt(arr[1]) % 2 == 0 ? "짝수" : "홀수";

        String result = (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])) % 2 == 0 ? "짝수" : "홀수";

        sb.append(a + "+" + b + "=" + result);

        System.out.println(sb);

    }
}
