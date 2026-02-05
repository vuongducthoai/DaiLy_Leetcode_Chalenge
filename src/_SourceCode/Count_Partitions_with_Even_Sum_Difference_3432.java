package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Count_Partitions_with_Even_Sum_Difference_3432 {
    public static int countPartitions(int[] nums) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i ++){
            sum += (nums[i]);
        }

        int preFixSum = 0;
        for(int i = 0; i < nums.length - 1; i ++){
            preFixSum += (2 * nums[i]);
            int result = preFixSum - sum;
            if(result % 2 == 0){
                set.add(result);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2};
        System.out.println(countPartitions(nums));
    }
}
