package week3.day3_1006.set_example;

public class RandomAlphabetGenerator implements NumberGenerator{

    char c = 'A';

    @Override
    public int generate(int num) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        return (int)(c + randomNumberGenerator.generate(num));
    }
}
