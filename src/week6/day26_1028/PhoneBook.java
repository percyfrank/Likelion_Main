package week6.day26_1028;

import java.util.HashSet;

public class PhoneBook {

    public boolean solution(String[] phone_book) {

        HashSet<String> hs = new HashSet<>();
        for(var num : phone_book) hs.add(num);

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
