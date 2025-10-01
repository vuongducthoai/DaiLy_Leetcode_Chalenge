package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Find_The_Least_Frequent_Digit_3663 {
    public static int getLeastFrequentDigit(int n) {
        Map<Integer, Integer> map = new HashMap<>(new HashMap<>());
        String number = String.valueOf(n);
        for(int i = 0; i < number.length(); i ++){
            int digit = number.charAt(i) - '0';
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            min = Math.min(entry.getValue(), min);
        }

        int result = 10;
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() == min){
                result = Math.min(result, it.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 1553322;
        System.out.println(getLeastFrequentDigit(n));
    }
}
