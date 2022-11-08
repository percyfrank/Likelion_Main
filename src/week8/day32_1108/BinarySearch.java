package week8.day32_1108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(br.readLine());

        int result = binary(arr, k, 0, n - 1);
        if(result == -1) System.out.println(-1);
        else System.out.println(result + 1);
    }

    public static int binary(int[] arr, int target, int start, int end) {
        if(start > end) return -1;
        int mid = (start + end) / 2;
        if(arr[mid] == target) return mid;
        else if (arr[mid] > target) return binary(arr,target,start,mid - 1);
        else return binary(arr, target, mid + 1, end);
    }
}
