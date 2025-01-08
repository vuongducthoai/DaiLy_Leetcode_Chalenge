package _SourceCode;

public class Count_Prefix_and_Suffix_Pairs_I_3042 {
    public static boolean isPrefixAndSuffix(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if (n1 > n2) return false;
        return str2.substring(0, n1).equals(str1) && str2.substring(n2 - n1).equals(str1);
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String words[] = {"a", "aba", "ababa", "aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }
}
