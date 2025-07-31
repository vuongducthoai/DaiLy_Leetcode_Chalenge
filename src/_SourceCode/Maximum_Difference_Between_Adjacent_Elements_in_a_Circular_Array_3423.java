package _SourceCode;

public class Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array_3423 {
    public static int maxAdjacentDistance(int[] nums) {
        int max = 0;
        for(int i = 1; i < nums.length; i ++){
            max = Math.max(max, Math.abs(nums[i] -  nums[i - 1]));
        }
        if(nums.length > 2){
            max = Math.max(max,  Math.abs(nums[nums.length - 1] -  nums[0]));
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {-5, -10, -5};
        System.out.println(maxAdjacentDistance(nums));
    }
}
