package week13.day55_1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinCostPath {

    static int n;
    static int m;
    static int[][] arr;
    static int[][] dp;

    public static int minCost(int[][] arr) {
        dp = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i == 1 && j == 1) dp[i][j] = arr[i-1][j-1];
                else if (i == 1) dp[i][j] = dp[i][j-1] + arr[i-1][j-1];
                else if (j == 1) dp[i][j] = dp[i-1][j] + arr[i-1][j-1];
                else dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + arr[i-1][j-1];
            }
        }

        return dp[n][m];
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        arr = new int[n][m];    // 1 3 2
                                // 4 6 2
                                // 1 2 4

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(minCost(arr));
    }
}

