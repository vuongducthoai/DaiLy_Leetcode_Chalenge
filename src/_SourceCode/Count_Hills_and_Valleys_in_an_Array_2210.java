package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Count_Hills_and_Valleys_in_an_Array_2210 {
    public static int countHillValley(int[] nums) {
        List<Integer> lists = new ArrayList<>();
        lists.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                lists.add(nums[i]);
            }
        }

        int ans = 0;
        for (int i = 1; i < lists.size() - 1; i ++){
            if((lists.get(i) > lists.get(i - 1) && lists.get(i) > lists.get(i + 1)) || (lists.get(i) < lists.get(i - 1) && lists.get(i) < lists.get(i + 1))) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,4, 1, 1, 6 ,5};
        System.out.println(countHillValley(nums));
    }
}
