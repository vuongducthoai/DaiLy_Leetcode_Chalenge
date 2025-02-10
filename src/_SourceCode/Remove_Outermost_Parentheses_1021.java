package _SourceCode;

import java.util.Stack;

public class Remove_Outermost_Parentheses_1021 {
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (!stack.isEmpty() && stack.size() > 1) {
                    sb.append('(');
                }
                stack.push('(');
            } else {
                if(!stack.isEmpty() && stack.size() > 1) {
                    sb.append(')');
                }
                stack.pop();
            }
        }
        return sb.toString();

    }

    static public void  main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
}
