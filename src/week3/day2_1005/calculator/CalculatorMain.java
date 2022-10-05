package week3.day2_1005.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        Calculator2 calculator2 = new Calculator2(10,randomNumberCreator);

        for(int i = 0; i < 100; i++) {
            calculator2.plus();
            calculator2.minus();
            calculator2.multiple();
            calculator2.divide();
        }
    }
}
