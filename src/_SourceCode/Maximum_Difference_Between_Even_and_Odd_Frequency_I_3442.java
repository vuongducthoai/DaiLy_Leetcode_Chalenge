package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Maximum_Difference_Between_Even_and_Odd_Frequency_I_3442 {
    public static int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(var entry : map.entrySet()){
            int value = entry.getValue();
            if(value % 2 == 1){
                max = Math.max(max, value);
            }
            if(value % 2 == 0){
                min = Math.min(min, value);
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        String s = "abcabcab";
        System.out.println(maxDifference(s));
    }
}
