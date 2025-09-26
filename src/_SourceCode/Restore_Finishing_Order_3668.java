package _SourceCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Restore_Finishing_Order_3668 {
    public static int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int num : friends){
            set.add(num);
        }

        int[] ans = new int[friends.length];
        int i = 0;
        for(int num : order){
            if(set.contains(num)){
                ans[i++] = num;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int order[] = {3, 1, 2, 5, 4};
        int friends[] = {1, 3, 4};
        System.out.println(Arrays.toString(recoverOrder(order, friends)));
    }

}
