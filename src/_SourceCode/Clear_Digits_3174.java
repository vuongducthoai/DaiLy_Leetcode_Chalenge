package _SourceCode;

import java.util.Stack;

public class Clear_Digits_3174 {
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57) {
                if(!stack.isEmpty())
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        String result = "";
        if(!stack.isEmpty()){
            for (int i = 0; i < stack.size(); i++) {
                result += stack.get(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(clearDigits(s));
    }
}
