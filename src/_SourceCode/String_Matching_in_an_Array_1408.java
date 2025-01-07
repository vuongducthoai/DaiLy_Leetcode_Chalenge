package _SourceCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class String_Matching_in_an_Array_1408 {
    public static List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].contains(words[j])) {
                    set.add(words[j]);
                }else {
                    if (words[j].contains(words[i])) {
                        set.add(words[i]);
                    }
                }
            }
        }
        for (String word : set) {
            list.add(word);
        }
        return list;
    }

    public static void main(String[] args) {
        String words[] = {"leetcoder","leetcode","od","hamlet","am"};
        System.out.println(stringMatching(words));
    }
}
