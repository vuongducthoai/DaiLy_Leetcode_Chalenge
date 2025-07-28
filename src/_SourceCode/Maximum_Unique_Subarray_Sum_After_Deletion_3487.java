package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Maximum_Unique_Subarray_Sum_After_Deletion_3487 {
    public static int maxSum(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        boolean allNegative = true;
        int ans = 0;
        for(int num : nums){
           if(num >= 0){
               allNegative = false;
           }
           if(num > maxValue){
               maxValue = num;
           }
        }

        if(allNegative){
            return maxValue;
        }

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num > 0){
                set.add(num);
            }
        }

        for(int s : set){
            ans += s;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(maxSum(nums));
    }
}
