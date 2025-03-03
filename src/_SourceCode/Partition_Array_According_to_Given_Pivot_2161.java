package _SourceCode;

import java.util.Arrays;

public class Partition_Array_According_to_Given_Pivot_2161 {
    public static int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == pivot){
                count++;
            } else if(nums[i] < pivot){
                ans[index] = nums[i];
                index++;
            }
        }

        for(int i = 0; i < count; i ++){
            ans[index] = pivot;
            index++;
        }

        for(int i = 0; i < nums.length; i ++){
            if(nums[i] > pivot){
                ans[index] = nums[i];
                index++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(nums, 10)));
    }
}
