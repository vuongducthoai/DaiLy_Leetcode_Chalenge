package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Add_to_Array_Form_Of_Integer_989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        for(int i = num.length - 1; i >= 0; i--){
            ans.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0){
            ans.add(0, k % 10);
            k /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num = {2,1,5};
        System.out.println(addToArrayForm(num, 1806));
    }
}
