package week7.day29_1102;

public class RemoveMultipleOf {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < Math.sqrt(n) + 1 ; i++) {
            if(arr[i] == 0) {
                int j = 2;
                while(i * j <= n) {
                    arr[i * j] = 1;
                    j++;
                }
            }
        }

        for(int i : arr) {
            if(i == 0)
                answer++;
        }

        return answer;
    }
        public static void main(String[] args) {
        RemoveMultipleOf rmo = new RemoveMultipleOf();
        System.out.println(rmo.solution(13));
    }
}
