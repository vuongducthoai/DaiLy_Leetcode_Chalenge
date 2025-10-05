package _SourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distriburte_Elements_Into_Two_Arrays_3069 {
    public static int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i = 2; i < nums.length; i ++){
            if(list1.get(list1.size() - 1) > list2.get(list2.size() - 1)){
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }
        int ans[] = new int[nums.length];
        int i = 0;
        for(int j = 0; j < list1.size(); j ++){
            ans[i++] = list1.get(j);
        }

        for(int k = 0; k < list2.size(); k++){
            ans[i++] = list2.get(k);
        }
        return ans;

    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 3};
        System.out.println(Arrays.toString(resultArray(nums)));
    }
}
