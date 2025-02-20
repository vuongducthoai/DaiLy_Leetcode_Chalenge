package _SourceCode;

public class Count_Prefixes_of_a_Given_String_2255 {
    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String w : words){
            if(s.length() >= w.length() && s.substring(0,w.length()).equals(w)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String words[] = {"e","s","mi","e","ia","ibwu","e","e","k","ci","rip","suw","a","l"};
        String s = "e";
        System.out.println(countPrefixes(words, s));
    }
}
