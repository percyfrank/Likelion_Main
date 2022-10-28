package week6.day26_1028;

import java.util.HashSet;

public class PhoneBook {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> hs = new HashSet<>();
        for(var num : phone_book) {
            hs.add(num);
            for(String s : hs.) {

            }
        }





        return answer;
    }



    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        boolean solution = phoneBook.solution(new String[]{"119", "97674223", "1195524421"});
        System.out.println(solution);
    }
}
