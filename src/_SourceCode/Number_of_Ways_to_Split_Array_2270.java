package _SourceCode;

public class Number_of_Ways_to_Split_Array_2270 {
    public static int waysToSplitArray(int[] nums) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        long left = 0;
        long right = 0;
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            right = sum - left;
            if(left >= right){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {10, 4, -8, 7};
        System.out.println(waysToSplitArray(nums));
    }
}
