package week3.day3_1006.set_example;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        for(int i = 0; i < 50 ; i++) {
            System.out.println(randomNumberGenerator.generate(10));
        }

    }

}
