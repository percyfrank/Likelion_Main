package week10.day44_1125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCDWithRecursion {

    /**
     * gcd(196, 42) = gcd(196 - 42, 42)
     * gcd(154, 42) = gcd(154 - 42, 42)
     * gcd(112, 42) = gcd(112 - 42, 42)
     * gcd(70, 42) = gcd(70 - 42, 42)
     * gcd(28, 42) = gcd(28, 42 - 28)
     * gcd(28, 14) = gcd(28 - 14, 14)
     * gcd(14, 14) = 14
     */
    public static int findGcd(int a, int b) {
        if(a==b) return a;
        else if (a > b) return findGcd(a-b,a);
        else if (a < b) return findGcd(a,b-a);
        else return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(findGcd(a,b));
    }
}
