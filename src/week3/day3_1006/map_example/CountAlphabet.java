package week3.day3_1006.map_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountAlphabet {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

//        HashMap<Character, Integer> map = new HashMap<>();
        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
//            map.put((char)(i+'a'),0);
        }

//        System.out.println(map);
//        Iterator it = map.entrySet().iterator();
//        Map.Entry entry = (Map.Entry)it;

        for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
//                if(s.charAt(i) == entry.getKey()) {
//                    map.put((char)(j + 'a'), map.getOrDefault((char)(j + 'a'),0) + 1);
        }


        for (int i = 0; i < 26; i++) {
            System.out.println("알파벳 " + (char)(i + 'a') + "의 개수는 : " + arr[i]);
        }


    }
}
