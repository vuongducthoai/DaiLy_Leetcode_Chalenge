package _SourceCode;

import java.util.LinkedList;
import java.util.List;

public class Find_Indices_of_Stateble_Mountains_3285 {
    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans = new LinkedList<>();
        for(int i = 1; i < height.length; i ++){
            if(height[i - 1] > threshold){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int height[] = {1, 2, 3, 4, 5};
        System.out.println(stableMountains(height, 2));
    }
}
