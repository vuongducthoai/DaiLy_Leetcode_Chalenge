package _SourceCode;

public class Reverse_Degree_of_A_String_3498 {
    public static int reverseDegree(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i ++){
           int number = s.charAt(i) - 'a';
           int product = Math.abs(number - 26) * (i + 1);
           ans += product;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseDegree(s));
    }
}
