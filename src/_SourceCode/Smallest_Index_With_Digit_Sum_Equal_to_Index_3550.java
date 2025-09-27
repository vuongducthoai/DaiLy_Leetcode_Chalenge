package _SourceCode;

public class Smallest_Index_With_Digit_Sum_Equal_to_Index_3550 {
    public static int sumDigitNumber(int number){
        int sum = 0;
        while(number != 0){
            sum += (number % 10);
            number = number / 10;
        }
        return sum;
    }
    public static int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i ++){
            int sumDigit = sumDigitNumber(nums[i]);
            if(sumDigit == i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 2};
        System.out.println(smallestIndex(nums));
    }
}
