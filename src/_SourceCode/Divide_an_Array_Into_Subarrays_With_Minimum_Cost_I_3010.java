package _SourceCode;

public class Divide_an_Array_Into_Subarrays_With_Minimum_Cost_I_3010 {
    public static int minimumCost(int[] nums) {
        int min1 =  51, min2 = 51;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] < min1){
                 min2 = min1;
                 min2 = nums[i];
            } else if(nums[i] < min2){
                min2 = nums[i];
            }
            if(min1 == 1 && min2 == 1) break;
        }
        return nums[0] + min1 + min2;
    }

    public static void main(String[] args) {
        int nums[] = {10,5, 4, 9, 8};
        System.out.println(minimumCost(nums));
    }
}
