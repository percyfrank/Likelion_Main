package week3.day3_1006.map_example;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//public class CountAlphabet {
//
//    private HashMap<Character, Integer> alphabetMap;
//    private String s;
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        for(char c = 'A'; c < 'Z'; c++) {
//            alphabetMap.put(c, 0);
//        }
//
//        AlphabetCnt alphabetCnt = new AlphabetCnt();
//        for(int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            boolean isAlphabet = alphabetCnt.isAlphabet(c);
//            if (isAlphabet) {
//                alphabetMap.put(c,alphabetMap.getOrDefault(c,0)+1);
//            }
//        }
//    }
//
//    public CountAlphabet(HashMap<Character, Integer> alphabetMap, String s) {
//        this.alphabetMap = alphabetMap;
//        this.s = s;
//    }
//}
