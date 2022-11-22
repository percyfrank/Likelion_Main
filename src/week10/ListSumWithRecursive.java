package week10;

import java.util.ArrayList;
import java.util.List;

public class ListSumWithRecursive {

    static int result = 0;
    public static int sum(List<Integer> nums) {

        if(nums.isEmpty()) return 0;
//        else return nums.remove(nums.size() - 1) + sum(nums);
        else {
            int last = nums.remove(nums.size() - 1);
            System.out.println(last);
            return last + sum(nums);
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        System.out.println(sum(nums));
    }
}
