package week11.day45_1128;

import java.util.HashSet;
import java.util.Set;

public class PrintAtoZCombination {

    public static int depth;

    public static void printAlphabet3(String prefix, int depth) {
        if(prefix.length() > depth) {
            System.out.println(prefix);
            return;
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            printAlphabet3(prefix + c,depth);
        }
    }

    public static void printAlphabet2(char c, String prefix) {
        if(c > 'Z') return;
        System.out.println(prefix + c);
        printAlphabet2((char)(c + 1),prefix);
    }

    public static void printAlphabet(char c) {
        if (c > 'Z') return; // 탈출 조건
        System.out.println(c); // c를 출력
        printAlphabet((char)(c + 1)); // 숫자 1개를 늘림
    }

    public static void main(String[] args) {
        printAlphabet('A');                     // A ~ Z 재귀로 출력
        printAlphabet2('A',"AA");                // AA ~ AZ 재귀로 출력
        printAlphabet3("",3);          // depth만큼

    }
}


