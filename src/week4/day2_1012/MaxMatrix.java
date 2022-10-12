package week4.day2_1012;

public class MaxMatrix {
    public static int[] getMax(int[] arr) {

        // loop 구성
        int maxIdx = 0;
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxIdx, maxValue};
    }
}
