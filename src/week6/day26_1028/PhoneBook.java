package week6.day26_1028;

import java.util.HashSet;

public class PhoneBook {

    public boolean solution(String[] phone_book) {

        HashSet<String> hs = new HashSet<>();
        for(var num : phone_book) hs.add(num);

        /**
         * 전화번호부 전체를 set에 넣고, set에 있는 전화번호가
         * 각 전화번호의 길이만큼 substring 했을 때 포함하는지 여부를 확인한다.
         * O(N^2) 에서 O(20N)으로 줄어듬
         */
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (hs.contains(phone_book[i].substring(0, j))) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        boolean solution = phoneBook.solution(new String[]{"119", "97674223", "1195524421"});
        System.out.println(solution);
    }
}
