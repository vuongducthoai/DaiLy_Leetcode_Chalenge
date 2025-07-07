package _SourceCode;

import java.util.Arrays;

public class Array_Partition_561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i+=2){
            j = i + 1;
            ans += Math.min(nums[i], nums[j]);
            j = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(nums));
    }
}
