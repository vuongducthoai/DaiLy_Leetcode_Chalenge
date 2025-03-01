package _SourceCode;

import java.util.Arrays;

public class Apply_Operations_to_an_Array_2460 {
    public static int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
                nums[i + 1] = 0;
            }
        }

        //Shift zeros to the end (in-place)
        int nonZeroIdx = 0;

        //Move all non-zero elements to the front
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[nonZeroIdx++] = nums[i];
            }
        }

        //Fill the remaining positions with zaros
        while(nonZeroIdx < nums.length){
            nums[nonZeroIdx++] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 1, 1, 0};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }
}
