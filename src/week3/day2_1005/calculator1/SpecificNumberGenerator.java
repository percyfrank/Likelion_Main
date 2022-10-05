package week3.day2_1005.calculator1;

public class SpecificNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return 2000 * num;
    }
}
