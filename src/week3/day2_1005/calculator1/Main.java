package week3.day2_1005.calculator1;

public class Main {
    public static void main(String[] args) {

        Calculator specificNumberCalculator = new Calculator(new SpecificNumberGenerator());
        Calculator randomNumberCalculator = new Calculator(new RandomNumberGenerator());

        specificNumberCalculator.plus();
        randomNumberCalculator.plus();


    }
}
