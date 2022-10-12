package week4.day2_1012;

public class Max01 {
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


    public static void main(String[] args) {

        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        int[] result = getMax(arr);

        if (result[0] == 7 && result[1] == 85) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 입니다. idx" + result[0] + ",  result" + result[1]);
        }
    }
}

