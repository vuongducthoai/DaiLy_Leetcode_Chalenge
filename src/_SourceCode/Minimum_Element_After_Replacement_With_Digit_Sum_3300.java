package _SourceCode;

public class Minimum_Element_After_Replacement_With_Digit_Sum_3300 {
    public static int digitSum(int num){
        int sum = 0;
        String s = String.valueOf(num);
        for(char c : s.toCharArray()){
            sum += c - '0';
        }
        return sum;
    }
    public static int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int num : nums){
            ans = Math.min(ans, digitSum(num));
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {10, 12, 13, 14};
        System.out.println(minElement(nums));
    }
}
