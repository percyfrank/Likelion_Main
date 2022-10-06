package codeup._221006;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1024 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            System.out.println("\'" + s.charAt(i) + "\'");
        }

    }
}
