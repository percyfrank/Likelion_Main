package week11.day47_1130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindParent {

    public static int goUp(int a, int b) {

        if(a > b)  {
            return goUp(a / 2, b) + 1;
        } else if(a < b) {
            return goUp(a, b / 2) + 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(goUp(a, b));
    }
}
