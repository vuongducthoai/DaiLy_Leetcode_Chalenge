package _SourceCode;

public class Check_If_Digits_Are_Equal_in_String_After_Operations_I_3461 {
    public static boolean hasSameDigits(String s) {
        while(s.length() > 2){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length() - 1; i ++){
                int firstDigit = s.charAt(i) - '0';
                int secondDigit = s.charAt(i + 1) - '0';
                int newDigit = (firstDigit + secondDigit) % 10;
                sb.append(newDigit);
            }
            s = sb.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }

    public static void main(String[] args) {
        String s  = "34789";
        System.out.println(hasSameDigits(s));
    }
}
