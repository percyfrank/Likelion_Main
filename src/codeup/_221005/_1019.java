package codeup._221005;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1019 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),".");

        int yy = Integer.parseInt(st.nextToken());
        int mm = Integer.parseInt(st.nextToken());
        int dd = Integer.parseInt(st.nextToken());

        System.out.printf("%04d.%02d.%02d",yy, mm,dd);

    }
}
