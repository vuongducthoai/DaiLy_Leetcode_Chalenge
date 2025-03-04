package _SourceCode;

public class Check_if_Number_is_a_Sum_of_Powers_of_Three_1780 {
    public static boolean checkPowersOfThree(int n) {
        while(n > 0){  // 3 ^ 0 = 1 | 3 ^ 1 = 3
            int remainder = n % 3;
            if(remainder == 2){
                return false;
            }
            n = n / 3;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 91;
        System.out.println(checkPowersOfThree(n));
    }
}
