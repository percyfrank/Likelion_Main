package week7.day28_1101;

public class findPrimeNumber {
    public int solution(int n) {

        int[] arr = new int[n + 1];
        int answer = 0;

        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (arr[i] == 0) {
                int j = 2;
                while (i * j <= n) {
                    arr[i * j] = 1;
                    j++;
                }
            }
        }

        for (int i = 2; i < n + 1; i++) {
            if(arr[i] == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        findPrimeNumber fn = new findPrimeNumber();
        System.out.println(fn.solution(10));
        System.out.println(fn.solution(5));


    }
}
