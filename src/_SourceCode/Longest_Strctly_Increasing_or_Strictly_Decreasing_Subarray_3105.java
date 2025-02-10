package _SourceCode;

public class Longest_Strctly_Increasing_or_Strictly_Decreasing_Subarray_3105 {
    public static int longestMonotonicSubarray(int[] nums) {
        int max_increasing = 1;
        int count_increasing = 1;
        int max_decreasing = 1;
        int count_decreasing = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                count_increasing++;
                max_increasing = Math.max(max_increasing, count_increasing);
            } else {

                count_increasing = 1;
            }
            if(nums[i] < nums [i - 1]) {
                count_decreasing++;
                max_decreasing = Math.max(max_decreasing, count_decreasing);
            } else {

                count_decreasing = 1;
            }
        }
        return Math.max(max_increasing, max_decreasing);
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 1};
        System.out.println(longestMonotonicSubarray(nums));
    }
}
