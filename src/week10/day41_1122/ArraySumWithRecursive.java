package week10.day41_1122;

public class ArraySumWithRecursive {

    static int[] arr;
    public static int sum(int n) {
        if(n < 0) return 0;
        return arr[n] + sum(n - 1);
    }

    public static void main(String[] args) {
        arr = new int[]{7, 3, 2, 9};
        System.out.println(sum(arr.length-1));
    }
}

