package week10.day44_1125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GCD {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;

        Arrays.sort(arr);

        int max = 0;
        for (int i = 1; i <= arr[0] ; i++) {
            int cnt = 0;

            for (int j = 0; j < 2; j++) {
                if(arr[j] % i == 0)  cnt++;
            }

            if(cnt == 2) {
                max = Math.max(max, i);
            }
        }
        System.out.println(max);
    }
}
