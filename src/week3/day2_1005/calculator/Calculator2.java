package week3.day2_1005.calculator;

public class Calculator2 {
    private int a;

    private NumberCreator numberCreator;

    public Calculator2(int a, NumberCreator numberCreator) {
        this.a = a;
        this.numberCreator = numberCreator;
    }

//    public int getRandomNumber() {
//        this.randomnum = (int)(Math.random()*10);
//        if(this.randomnum == 0) {
//            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
//        }
//        return randomnum;
//    }

    public void plus() {
        System.out.println(", 결과는 : " + (a + numberCreator.randomNumber()));
    }

    public void minus() {
        System.out.println(", 결과는 : " + (a - numberCreator.randomNumber()));
    }

    public void multiple() {
        System.out.println(", 결과는 : " + (a * numberCreator.randomNumber()));
    }

    public void divide() {
        try{
            double result = ((double)a / numberCreator.randomNumber());
            if(Double.isInfinite(result) || Double.isNaN(result)){
                throw new ArithmeticException();
            }
            System.out.println(", 결과는 : " + result);
        } catch(ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("======================================");
        }
    }

}
