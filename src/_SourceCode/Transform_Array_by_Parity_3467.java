package _SourceCode;

import java.util.Arrays;

public class Transform_Array_by_Parity_3467 {
    public static int[] transformArray(int[] nums) {
       int n = nums.length;
       int count = 0;
       for(int i = 0; i < n; i ++){
           if(nums[i] % 2 == 0){
               count++;
           }
       }

       for(int i = 0; i < nums.length; i++){
           if(i < count){
               nums[i] = 0;
           }else {
               nums[i] = 1;
           }
       }
       return nums;
    }

    public static void main(String[] args) {
        int nums[] = {4, 3, 2, 1};
        System.out.println(Arrays.toString(transformArray(nums)));

    }
}
