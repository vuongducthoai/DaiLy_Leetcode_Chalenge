package _SourceCode;

import java.util.Arrays;

public class Permutation_Difference_between_Two_Strings_3146 {
    public static int findPermutationDifference(String s, String t) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            int c1 = s.charAt(i) - 'a';
            int c2 = t.charAt(i) - 'a';
            freq1[c1] = i;
            freq2[c2] = i;
        }
        int count = 0;
        for(int i = 0 ; i < 26; i ++){
            count += Math.abs(freq1[i] - freq2[i]);
        }
        return count;

    }

    public static void main(String[] args) {
        String s = "abcde";
        String t = "edbac";
        System.out.println(findPermutationDifference(s, t));
    }
}
