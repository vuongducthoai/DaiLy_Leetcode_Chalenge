package _SourceCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Transformed_Array_3379 {
    public static int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i ++){
            result[i] = nums[((i + nums[i]) % n + n) % n];
        }
        return result;

    }

    public static void main(String[] args) {
        int nums[] = {3, -2, 1, 1};
        System.out.println(Arrays.toString(nums));
    }
}
