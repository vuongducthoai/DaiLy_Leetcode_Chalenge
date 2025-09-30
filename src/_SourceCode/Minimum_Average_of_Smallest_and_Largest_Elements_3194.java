package _SourceCode;

import java.util.Arrays;

public class Minimum_Average_of_Smallest_and_Largest_Elements_3194 {
    public static double minimumAverage(int[] nums) {
        int n = nums.length;
        double min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int l = 0;
        int r = n - 1;
        for(int i = 0; i < n / 2; i ++){
            double average = (1.0) * (nums[l] + nums[r]) / 2;
            l++;
            r--;
            min = Math.min(min, average);
        }
        return min;
    }

    public static void main(String[] args) {
        int nums[] = {7, 8, 3, 4 ,15, 13, 4, 1};
        System.out.println(minimumAverage(nums));
    }
}
