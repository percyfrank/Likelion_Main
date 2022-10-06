package week3.day3_1006.set_example;

import java.util.HashSet;

public class RndAlphabetWithoutDuplicated {
    public static void main(String[] args) {

//        NumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        NumberGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();

//        HashSet<Integer> studentsWithoutDuplicated = new HashSet<>();
        HashSet<Character> alphabetWithoutDuplicated = new HashSet<>();


        int cnt = 0;
        for(int i = 0; i < 50 ; i++) {
            alphabetWithoutDuplicated.add((char)randomAlphabetGenerator.generate(10));
        }

        System.out.println(alphabetWithoutDuplicated);
    }

}
