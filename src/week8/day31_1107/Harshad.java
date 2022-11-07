package week8.day31_1107;

public class Harshad {
    public boolean solution(int x) {
        boolean answer = true;

        String harshad = String.valueOf(x);

        int sum = 0;
        for (int i = 0; i < harshad.length(); i++) {
            sum += (harshad.charAt(i) - '0');
        }

        if(x % sum == 0) answer = true;
        else answer = false;

        return answer;
    }

    public static void main(String[] args) {
        Harshad d = new Harshad();
        System.out.println(d.solution(10));
        System.out.println(d.solution(11));
        System.out.println(d.solution(12));
        System.out.println(d.solution(13));
    }

}
