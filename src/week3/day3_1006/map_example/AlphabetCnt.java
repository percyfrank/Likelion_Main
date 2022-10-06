package week3.day3_1006.map_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AlphabetCnt {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase();
        AlphabetCnt alphabetCnt = new AlphabetCnt();
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        for(char c = 'A'; c < 'Z'; c++) {
            alphabetMap.put(c, 0);
        }

//        Iterator it = alphabetMap.entrySet().iterator();
//        Map.Entry entry = (Map.Entry)it;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if (isAlphabet == true) {
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
        System.out.println(alphabetMap);
    }


    public boolean isAlphabet(char c) {

        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
            return true;
        else {
            System.out.println("알파벳이 아닙니다.");
            return false;
        }
    }

}
