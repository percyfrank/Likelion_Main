package week6.day26_1028;

import java.util.HashSet;
import java.util.Set;

public class Poketmon {
    public int solution(int[] nums) {

        // 폰켓몬 종류가 중복되어도 제거된다.
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int num = nums.length / 2;

        /**
         * set의 개수와 num을 비교해서 큰 값을 return하도록 설계
         * 이렇게 해도 되는 이유는 중복된 종류의 폰켓몬이 set에 입력되지 않았다면
         * 가장 많은 종류의 폰켓몬을 선택하는 방법은 N / 2마리이기 때문이다.
         * 중복된 종류가 많아서 N /2 마리보다도 set에 입력된 폰켓몬 종류가 적을 때는 set의 크기 자체가 가장 많은 종류의
         * 폰켓몬을 선택하는 방법이 된다.
         */
        if(num < set.size()) return num;
        else return set.size();

    }

    public static void main(String[] args) {

        Poketmon poketmon = new Poketmon();
        System.out.println(poketmon.solution(new int[]{3, 1, 2, 3}));
    }


}
