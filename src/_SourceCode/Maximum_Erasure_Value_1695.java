package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Maximum_Erasure_Value_1695 {
    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int currentSum = 0, result = 0, start = 0;
        for(int i = 0; i < nums.length; i ++){
            while (set.contains(nums[i])){
                set.remove(nums[start]);
                currentSum -= nums[start];
                start++;
            }

            set.add(nums[i]);
            currentSum += nums[i];
            result  = Math.max(currentSum, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {5,2,1,2,5,2,1,2,5};
        System.out.println(maximumUniqueSubarray(nums));

    }
}
