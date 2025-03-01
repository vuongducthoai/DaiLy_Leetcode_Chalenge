package _SourceCode;

import java.util.*;

public class Minimum_Index_Sum_of_Two_List_599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    map.put(list1[i], i + j);
                    break;
                }
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int sum : map.values()) {
            minSum = Math.min(minSum, sum);
        }

        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == minSum) {
                res.add(entry.getKey());
            }
        }

        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] result = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result));
    }
}
