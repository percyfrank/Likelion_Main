package week9.day36_1114;

public class PrimeNumber {
    public static void solution(int n) {

        int[] check = new int[n + 1];

        for (int i = 2; i < Math.sqrt(n) + 1 ; i++) {
            if(check[i] == 0) {
                int j = 2;
                while(i * j <= n) {
                    check[i*j] = 1;
                    j++;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(check[i] == 0)
                System.out.printf("%d ",i);
        }

    }


    public static void main(String[] args) {
        solution(10);
    }

}
