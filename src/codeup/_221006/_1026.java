package codeup._221006;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1026 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] hhmmss = br.readLine().split(":");

        System.out.println(Integer.parseInt(hhmmss[1]));

        }
}
