package week7.day28_1101;

public class findPrimeNumber {
    public int solution(int n) {

        int answer = 1;

        boolean flag = false;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < Math.sqrt(i) + 1; j++) {
                if(i % j == 0) flag = true;
            }
            if(!flag) answer++;
            flag = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        findPrimeNumber fn = new findPrimeNumber();
        System.out.println(fn.solution(10));
        System.out.println(fn.solution(5));


    }
}
