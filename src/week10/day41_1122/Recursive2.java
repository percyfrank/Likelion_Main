package week10.day41_1122;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive2 {


    static long N;

    public static long sum(long N) {

        if(N == 0) return 0;
        return N % 10 + sum(N / 10);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        System.out.println(sum(N));
    }
}
