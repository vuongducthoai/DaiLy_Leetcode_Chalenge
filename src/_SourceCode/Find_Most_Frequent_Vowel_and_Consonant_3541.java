package _SourceCode;

public class Find_Most_Frequent_Vowel_and_Consonant_3541 {
    public static int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxVowel = 0; int maxCon = 0;
        for(char c : s.toCharArray()){
            int num = c - 'a';
            freq[num]++;
            if(c == 'a' || c == 'e'|| c =='i' || c == 'i' || c == 'o'|| c =='u'){
                maxVowel = Math.max(maxVowel, freq[num]);
            } else {
                maxCon = Math.max(maxCon, freq[num]);
            }

        }
        return maxVowel + maxCon;
    }

    public static void main(String[] args) {
        String s = "successes";
        System.out.println(maxFreqSum(s));
    }
}
