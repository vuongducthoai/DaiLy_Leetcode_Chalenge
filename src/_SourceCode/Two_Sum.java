package _SourceCode;

import java.util.*;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int ans[] = new int[2];
        for(int i = 0; i < nums.length; i ++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
