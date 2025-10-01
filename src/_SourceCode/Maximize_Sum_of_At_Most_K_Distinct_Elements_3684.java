package _SourceCode;

import java.util.*;

public class Maximize_Sum_of_At_Most_K_Distinct_Elements_3684 {
    public static int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        List<Integer> slist = new ArrayList<>(set);
        Collections.sort(slist, Collections.reverseOrder());
        System.out.println(slist);
        int[] result = new int[Math.min(k, slist.size())];
        for(int i = 0; i < result.length; i++){
            result[i] = slist.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        int nums[] = {84, 93, 100, 77, 90};
        int k = 3;
        System.out.println(maxKDistinct(nums, 3));
    }
}
