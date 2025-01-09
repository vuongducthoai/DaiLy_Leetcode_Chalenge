package _SourceCode;

public class Merge_Strings_Alternately_1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int n1 = word1.length();
        int n2 = word2.length();
        int n = n1;
        if (n1 > n2){
            n = n2;
        }
        int j = 0, k = 0;
        for (int i = 0; i < n; i ++) {
            sb.append(word1.charAt(j));
            j++;
            sb.append(word2.charAt(k));
            k++;
        }
        if (n1 > n2){
            sb.append(word1.substring(j));
        } else {
            sb.append(word2.substring(k));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }
}
