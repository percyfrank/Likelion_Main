package codeup._221006;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1025 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        for(int i = 0; i < s.length() ; i++) {
            System.out.printf("[%d]\n",(int)((s.charAt(i)-'0')*Math.pow(10,(s.length()-i-1))));
        }

    }
}
