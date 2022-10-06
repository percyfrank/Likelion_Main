package week3.day3_1006.set_example;

import java.util.HashSet;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        HashSet<Integer> studentsWithoutDuplicated = new HashSet<>();


        int cnt = 0;
        for(int i = 0; i < 50 ; i++) {
            studentsWithoutDuplicated.add(randomNumberGenerator.generate(10));
        }
        System.out.println(studentsWithoutDuplicated);

    }

}
