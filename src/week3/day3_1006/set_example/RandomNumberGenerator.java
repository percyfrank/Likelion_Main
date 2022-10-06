package week3.day3_1006.set_example;

public class RandomNumberGenerator implements NumberGenerator{

    @Override
    public int generate(int num) {
        return (int)(Math.random() * num);
    }
}
