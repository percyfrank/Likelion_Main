package week7.day27_1031;

public class PrepareTest {
    /**
     * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
     * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
     * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
     * <p>
     * 1 2 3 4 5
     */

    static int[] arr1 = {1, 2, 3, 4, 5};
    static int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
    static int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    public int[] solution(int[] answers) {

        int cnt = 0;
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i]) {
                cnt++;
            }
        }
        int[] answer = {};
        return answer;
    }



    public static void main(String[] args) {

        int[] answers = {1, 2, 3, 4, 5};
        PrepareTest pt = new PrepareTest();
        System.out.println(pt.solution(answers));
    }


}
