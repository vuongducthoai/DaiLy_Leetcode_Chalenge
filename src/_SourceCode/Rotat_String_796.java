package _SourceCode;

public class Rotat_String_796 {
    public static boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while(i < s.length()){
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            if(sb.toString().equals(goal)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
}
