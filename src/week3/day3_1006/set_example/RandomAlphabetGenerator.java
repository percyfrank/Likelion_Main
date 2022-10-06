package week3.day3_1006.set_example;

public class RandomAlphabetGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int)((int)(Math.random() * num) + 65);
    }
}
