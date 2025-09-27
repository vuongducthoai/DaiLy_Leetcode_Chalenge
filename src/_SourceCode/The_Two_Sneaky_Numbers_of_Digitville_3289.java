package _SourceCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class The_Two_Sneaky_Numbers_of_Digitville_3289 {
    public static int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            if(set.contains(num)){
                list.add(num);
            } else {
                set.add(num);
            }
        }

        int ans[] = new int[list.size()];
        int j = 0;
        for(int i = 0; i < list.size(); i++){
            ans[j++] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 1, 0};
        System.out.println(getSneakyNumbers(nums));
    }
}
