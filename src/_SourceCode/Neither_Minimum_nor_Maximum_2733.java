package _SourceCode;

import java.util.Arrays;

public class Neither_Minimum_nor_Maximum_2733 {
    public static int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2){
            return -1;
        }

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    static void main() {
        int nums[] = {2, 1, 3};
        System.out.println(findNonMinOrMax(nums));
    }
}
