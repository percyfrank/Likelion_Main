package week11.day47_1130;



public class findPAndY {

    boolean solution(String s) {

        int p_cnt = 0;
        int y_cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'p' || c == 'P') p_cnt++;
            else if (c == 'y' || c == 'Y') y_cnt++;
        }
        return p_cnt == y_cnt ? true : false;
    }

    public static void main(String[] args) {

        findPAndY findPAndY = new findPAndY();
        System.out.println(findPAndY.solution("pPoooyY"));
        System.out.println(findPAndY.solution("Pyy"));
    }
}
