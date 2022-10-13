package week4.day3_1013;

public class BubbleSort01 {
    public static void main(String[] args) {


        int[] arr = {7, 2, 3, 9, 28, 11};
        BubbleSort01 sort = new BubbleSort01();
        sort.sort(arr.length,arr);

        for(int i : arr)
            System.out.println(i);

    }

    public int[] sort(int n, int arr[]) {

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n-i; j++) {
                int tmp = 0;
                if(arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
