package week5.day21_1021;

import java.util.Stack;

public class SolveBracket {

    public boolean solution(String s) {
        while(s.indexOf("()") >= 0) {
            s = s.replace("()","");
        }

        return s.length() == 0;
    }

    public boolean solution1(String s) {
        while(s.indexOf("()") >= 0){
            String[] splitted = s.split("\\(\\)");
            s = String.join("",splitted);
        }

        return s.length() == 0;
    }


    public boolean solution3(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
