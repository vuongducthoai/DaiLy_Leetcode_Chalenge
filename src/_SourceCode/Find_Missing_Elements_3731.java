package _SourceCode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Find_Missing_Elements_3731 {
    public static List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new LinkedList<>();
        for(int num : nums){
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for(int i = min; i <= max ; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int nums[] = {7, 8, 6, 9};
        System.out.println(findMissingElements(nums));
    }
}
