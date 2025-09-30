package _SourceCode;

import java.util.Arrays;

public class Divide_a_String_Into_Groups_of_Size_k_2138 {
    public static String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int groups = (n + k - 1) / k;
        String result[] = new String[groups];

        for(int i = 0; i < groups; i++){
            StringBuilder group = new StringBuilder();
            for(int j = 0; j < k; j ++){
                int index = i * k + j;
                if(index < n){
                    group.append(s.charAt(index));
                } else {
                    group.append(fill);
                }
            }
            result[i] = group.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcdefghi";
        char fill = 'x';
        int k = 3;
        System.out.println(Arrays.toString(divideString(s, k, fill)));
    }
}
