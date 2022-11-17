package week9.day37_1115;

import java.util.ArrayList;
import java.util.List;

public class QuickSort2 {

    public static List<Integer> merge(List<Integer> left,List<Integer> mid,List<Integer> right) {

        ArrayList<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);
        return answer;
    }

    public static List<Integer> sort(List<Integer> arr) {

        if(arr.size() <= 1) return arr;

        int pivot = arr.get(arr.size() / 2);

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> mid = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if(pivot > arr.get(i)) left.add(arr.get(i));
            else if(pivot < arr.get(i)) right.add(arr.get(i));
            else mid.add(arr.get(i));
        }

        return merge(sort(left), mid, sort(right));

    }


    public static void main(String[] args) {
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("startMemory : " + usedMemory + " bytes\n");
        System.out.println("--------------------------------");

        long startTime = System.nanoTime();
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(sort(list));

        long finishTime = System.nanoTime();
        long elapsedTime = finishTime - startTime;
        System.out.println("startTime(ns) : " + startTime);
        System.out.println("finishTime(ns) : " + finishTime);
        System.out.println("elapsedTime(ns) : " + elapsedTime);

        Runtime.getRuntime().gc();
        long usedMemory1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("--------------------------------");
        System.out.println("finishMemory : " + usedMemory1 + " bytes\n");
    }
}
