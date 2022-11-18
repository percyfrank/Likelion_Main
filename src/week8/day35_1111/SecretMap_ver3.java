package week8.day35_1111;

import java.util.Arrays;

public class SecretMap_ver3 {
    String[] solution(int n, int[] arr1, int[] arr2) {
        var answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1","#").replace("0", " ");
            // 자릿수 맞춰주는 연산
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        SecretMap sm = new SecretMap();
        String[] solution = sm.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        String[] solution1 = sm.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});

        System.out.println(Arrays.toString(solution));
        System.out.println(Arrays.toString(solution1));
    }
}
