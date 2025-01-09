package _SourceCode;

import java.util.Stack;

public class Make_The_String_Great_1544_ {
    public static String makeGood(String s) {
        Stack<Character> stacks = new Stack<>();
        stacks.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if ( !stacks.empty() && ((char)(c + 32) == stacks.peek() ||(char)(c - 32) == stacks.peek())) {
                stacks.pop();
            }else {
                stacks.push(c);
            }
        }
        if (stacks.empty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : stacks) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeGood("Pp"));
    }
}
