package week6.day26_1027;

import java.util.*;

public class Marathon {
    static String[] participant;
    static String[] completion;
    public static void main(String[] args) {
        participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        completion = new String[] {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        String answer = "";
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            if ((Integer) e.getValue() != 0) {
                answer = (String) e.getKey();
            }
        }
        return answer;
    }
}
