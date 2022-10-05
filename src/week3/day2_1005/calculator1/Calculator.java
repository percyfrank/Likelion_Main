package week3.day2_1005.calculator1;

public class Calculator {

    // NumberGenerator에서 만들어준 숫자를 가지고
    // 사칙 연산한 결과를 출력한다.
    private NumberGenerator numberGenerator;

    private int baseNum = 200;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Calculator(NumberGenerator numberGenerator, int baseNum) {
        this.numberGenerator = numberGenerator;
        this.baseNum = baseNum;
    }

    public void plus(int num) {
        int result = num + this.numberGenerator.make(this.baseNum);
        System.out.println(result);
    }



}
