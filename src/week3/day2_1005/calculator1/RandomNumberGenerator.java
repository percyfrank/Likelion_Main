package week3.day2_1005.calculator1;

public class RandomNumberGenerator implements NumberGenerator{

    @Override
    public int make(int num) {
        return (int)(Math.random() * num);
    }
}
