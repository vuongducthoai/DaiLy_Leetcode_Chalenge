package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Count_Elements_With_Maximum_Frequency_3005 {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, map.get(num));
        }

        int total = 0;
        for(var entry : map.entrySet()){
            int value = entry.getValue();
            if(value == max){
                total += value;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        System.out.println(maxFrequencyElements(nums));
    }
}
