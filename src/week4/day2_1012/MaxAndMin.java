package week4.day2_1012;
public class MaxAndMin {
    public static int getMaxOrMin(int[] arr, Compare compare) {

        // loop 구성
        int targetValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            boolean isSth = compare.doSomething(arr[i], targetValue);
            if (isSth) {
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    public static int max(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public static int min(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};

        int max = max(arr);
        int min = min(arr);

        System.out.println(max);
        System.out.println(min);

    }
}

