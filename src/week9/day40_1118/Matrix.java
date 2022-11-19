package week9.day40_1118;

import java.util.Arrays;

public class Matrix {
    public int[][] sumMatrix(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public int[][] multiplyMatrix(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr2[i].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        int[][] sumMatrix = matrix.sumMatrix(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}});
        int[][] multiplyMatrix = matrix.multiplyMatrix(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}});
        System.out.println(Arrays.deepToString(sumMatrix));
        System.out.println(Arrays.deepToString(multiplyMatrix));
        int[][] sumMatrix1 = matrix.sumMatrix(new int[][]{{1}, {2}}, new int[][]{{3}, {4}});
        System.out.println(Arrays.deepToString(sumMatrix1));
    }
}
