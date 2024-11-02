package _SourceCode;


public class Circular_Sentences_2490 {
    public static boolean isCircularSentence(String sentence) {
        String words[] = sentence.split(" ");
        if(words.length == 1 && words[0].charAt(0) != words[0].charAt(words[0].length() - 1)) {
            return false;
        } else if(words.length == 1 && words[0].charAt(0) == words[0].charAt(words[0].length() - 1)) {
            return true;
        }
        String tmp = words[0];
        if(tmp.charAt(0) != words[words.length - 1].charAt(words[words.length - 1].length() - 1)) {
            return false;
        }
        for(int i = 1; i < words.length; i++) {

            if(words[i].charAt(0) != tmp.charAt(tmp.length() - 1)) {
                return false;
            }
            tmp = words[i];
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "Leetcode eisc cool";
        System.out.println(isCircularSentence(sentence));
    }
}
