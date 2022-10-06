package codeup._221006;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1027 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),".");
        String[] arr = new String[3];

        int i = 1;
        while (st.hasMoreTokens()) {
            arr[arr.length-i] = st.nextToken();
            i++;
        }

        String str = String.join("-",arr);
        System.out.println(str);

    }
}
