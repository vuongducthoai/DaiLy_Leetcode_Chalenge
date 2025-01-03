package _SourceCode;

public class Maximum_Score_After_Splitting_a_String__1422 {
    public static int maxScore(String s) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(0, i + 1);
            String s2 = s.substring(i + 1, s.length());
            if (s1.length() > 0 && s2.length() > 0) {
                for (int j = 0; j < s1.length(); j++) {
                    if (s1.charAt(j) == '0') {
                        sum += 1;
                    }
                }

                for (int j = 0; j < s2.length(); j++) {
                    if (s2.charAt(j) == '1') {
                        sum += 1;
                    }
                }
            }

            ans = Math.max(ans, sum);
            sum = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "00";
        System.out.println(maxScore(s));
    }
}
