package week3.day3_1006.set_example;

public class RandomAlphabetGenerator implements NumberGenerator{

    char c = 'A';

    @Override
    public int generate(int num) {
        return (int)(c + new RandomNumberGenerator().generate(num));
    }
}
