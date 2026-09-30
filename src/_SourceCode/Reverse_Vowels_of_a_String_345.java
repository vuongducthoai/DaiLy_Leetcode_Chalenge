package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Reverse_Vowels_of_a_String_345 {
    public static String reverseVowels(String s){
        String vowels = "uUEeoOaAiI";
        List<Character> arrVowels = new ArrayList<>();
        for(int i = 0; i < s.length(); i ++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                arrVowels.add(s.charAt(i));
            }
        }

        int k = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i ++){
            if(vowels.indexOf(s.charAt(i)) != -1 && k >= 0 && k < arrVowels.size()){
                sb.append(arrVowels.get(arrVowels.size() - 1 - k));
                k++;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
