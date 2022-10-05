package week3.day2_1005.calculator;

public class RandomNumberCreator implements NumberCreator {

    @Override
    public int randomNumber(){

        int number = (int)(Math.random() * 10);
        System.out.print("랜덤한 숫자는 : " + number);
        return number;
    }

}
