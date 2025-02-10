package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Count_Number_of_Bad_Pairs_2364 {
    public static long countBadPairs(int[] nums) {
        /*
           nums[j] - nums[i] = j - i
           <=> nums[j] - j = nums[i] - i
          => A pair (i, j) is considered good if and only if d_i = d_j
         */
        int n = nums.length;
        long totalPairs = (long)n * (n - 1) / 2; // số cặp có tối đa nếu thỏa mãn tất cả
        Map<Integer, Long> diffCount = new HashMap<>();
        for(int i = 0; i < n; i ++){
            int diff = nums[i] - i;
            totalPairs -= diffCount.getOrDefault(diff, 0L);
            diffCount.put(diff, diffCount.getOrDefault(diff, 0L) + 1);

        }

        return totalPairs;

    }

    public static void main(String[] args) {
        int nums[] = {4, 1, 3, 3};
        System.out.println(countBadPairs(nums));
    }
}
