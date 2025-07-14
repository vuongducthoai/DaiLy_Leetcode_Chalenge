package _SourceCode;

import java.util.HashMap;
import java.util.Map;

public class Find_Lucky_Interger_in_an_Array_1394 {
    public static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        int luckyInteger = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                luckyInteger = key;
            }
        }
        return luckyInteger;
    }

    public static void main(String[] args) {
        int[] arr ={1, 2, 2, 3, 3, 3};
        System.out.println(findLucky(arr));
    }
}
