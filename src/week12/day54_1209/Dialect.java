package week12.day54_1209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dialect {

    static int[][] dp;

    public static int dialect(String s1,String s2) {

        dp = new int[s2.length()+1][s1.length()+1];


        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if(s1.charAt(j) == s2.charAt(i)) {
                    dp[i+1][j+1] = dp[i][j] + 1;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }

        return dp[s2.length()][s1.length()];

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();  // sicohwkdfjxo
        String s2 = br.readLine();  // wocibhxs

        System.out.println(dialect(s1, s2));
    }
}
