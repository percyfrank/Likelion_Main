package week3.day3_1006.map_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlphabetCnt {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        AlphabetCnt alphabetCnt = new AlphabetCnt();

        for(int i = 0; i < s.length(); i++){
            if(alphabetCnt.isAlphabet(s.charAt(i)) == true) {

            } else {
                System.out.println("알파벳이 아닙니다.");
                break;
            }
        }

    }


    public boolean isAlphabet(char c) {

        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
            return true;
        else
            return false;
    }


}
