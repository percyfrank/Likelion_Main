package week11.day45_1128;

import java.util.HashSet;

public class FindPrimeNumber {
    public static char[] numArray;
    public static boolean[] visited;
    public static HashSet<Integer> set = new HashSet<>();;

    public static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2) return true;

        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void dfs(String num, int idx) {

        if(num != "") set.add(Integer.parseInt(num));

        if(idx == numArray.length) return;

        for (int i = 0; i < numArray.length; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            dfs(num + numArray[i], idx + 1);
            visited[i] = false;
        }

    }

    public static int solution(String numbers) {
        int answer = 0;

        numArray = numbers.toCharArray();
        visited = new boolean[numbers.length()];

        dfs("", 0);

        for (Integer integer : set) {
            if(isPrime(integer)) answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution("011"));
        System.out.println(solution("17"));
    }
}
