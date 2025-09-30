package _SourceCode;

public class Check_Balanced_String_3340 {
    public static boolean isBalanced(String num) {
        int sumEven = 0;
        int summOdd = 0;
        for(int i = 0 ; i < num.length(); i ++){
            if(i % 2 == 0){
                summOdd += (num.charAt(i) - '0');
            } else {
                sumEven += (num.charAt(i) - '0');
            }
        }
        return summOdd == sumEven;
    }

    public static void main(String[] args) {
        String num = "1234";
        System.out.println(isBalanced(num));
    }
}
