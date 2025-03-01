package _SourceCode;

import java.util.Set;
import java.util.TreeSet;

public class Count_Pairs_Of_Similar_Strings_2506 {
    public static int similarPairs(String[] words) {
        for(int i = 0; i < words.length; i++){
            String str = words[i];
            Set<Character> set = new TreeSet<>();
            for(int j = 0; j < str.length(); j++){
                set.add(str.charAt(j));
            }

            StringBuilder temp = new StringBuilder();
            for(char c : set){
                temp.append(c);
            }
            words[i] = temp.toString();

        }

        int count = 0;
        for(int i = 0; i < words.length - 1; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String words[] = {"aba", "aabb", "abcd", "bac", "aabc"};
        System.out.println(similarPairs(words));
    }
}
