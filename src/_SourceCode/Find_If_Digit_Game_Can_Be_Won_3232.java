package _SourceCode;

public class Find_If_Digit_Game_Can_Be_Won_3232 {
    public static boolean canAliceWin(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int num : nums){
            if(num < 10){
                sum1 += num;
            } else {
                sum2 += num;
            }
        }
        return sum1 != sum2;
    }

    public static void main(String[] args) {
        int nums[] = {1,2, 3, 4, 5, 14};
        System.out.println(canAliceWin(nums));
    }
}
