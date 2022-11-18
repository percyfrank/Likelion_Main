package week8.day35_1111;

import java.util.Arrays;

public class SecretMap_ver2 {
    String getBinaryString(int decNum) {
        String answer = "";
        while (decNum > 0) {
            answer += decNum % 2;
            decNum /= 2;
        }
        return answer;
    }

    String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];
        for (int i = 0; i < n; i++) {
            // arr1
            String binStr1 = getBinaryString(arr1[i]);
            String binStr2 = getBinaryString(arr2[i]);
            sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1;
            sArr2[i] = "0".repeat(n - binStr2.length()) + binStr2;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(sArr1[i].charAt(j) == '1' || sArr2[i].charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb = new StringBuffer();
        }
        return answer;
    }

    public static void main(String[] args) {
        SecretMap_ver2 sm = new SecretMap_ver2();
        String[] solution = sm.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
//        String[] solution1 = sm.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});

        System.out.println(Arrays.toString(solution));
//        System.out.println(Arrays.toString(solution1));
    }
}
