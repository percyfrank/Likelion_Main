package week4.day1_1011;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfDigit {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        int sum = 0;
        for(int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }

        System.out.println(sum);
    }

}
