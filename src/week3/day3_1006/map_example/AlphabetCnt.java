package week3.day3_1006.map_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlphabetCnt {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        AlphabetCnt alphabetCnt = new AlphabetCnt();

        for(int i = 0; i < s.length(); i++){
            if(!(alphabetCnt.isAlphabet(s.charAt(i)) == true))
                System.out.println("알파벳이 아닙니다.");
        }

    }


    public boolean isAlphabet(char c) {

        if((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
            return true;
        else
            return false;
    }


}
