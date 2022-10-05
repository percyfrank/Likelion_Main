package week3.day2_1005.calculator1;

public class CalculatorMain {
    public static void main(String[] args) {
//        Calculator randomNumberCalculator = new Calculator(new RandomNumberGenerator());
        Calculator randomNumberCalculator = new Calculator(new RandomNumberGenerator(),300);
        randomNumberCalculator.plus(20);

//        Calculator specificNumberCalculator = new Calculator(new SpecificNumberGenerator());
        Calculator specificNumberCalculator = new Calculator(new SpecificNumberGenerator(),300);
        specificNumberCalculator.plus(20);

//        Calculator bypassNumberCalculator = new Calculator(new BypassNumberGenerator());
        Calculator bypassNumberCalculator = new Calculator(new BypassNumberGenerator(),300);
        bypassNumberCalculator.plus(20);

    }
}
