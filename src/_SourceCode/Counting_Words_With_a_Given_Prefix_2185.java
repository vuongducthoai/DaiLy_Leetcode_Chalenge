package _SourceCode;

public class Counting_Words_With_a_Given_Prefix_2185 {
    public static boolean isPrefix(String word, String prefix) {
        if (prefix.length() > word.length()) return false;
        return word.startsWith(prefix);
    }

    public static int prefixCount(String[] words, String pref) {
        int ans = 0;
        for (int i = 0; i < words.length; i ++){
            if (isPrefix(words[i], pref)) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String words[] = {"leetcode","win","loops","success"};
        System.out.println(prefixCount(words, "code"));
    }
}
