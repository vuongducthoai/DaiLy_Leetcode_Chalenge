package _SourceCode;

public class Find_the_Original_Typed_String_I_3330 {
    public static int possibleStringCount(String word) {
        int n=word.length();
        int count=n;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)!=word.charAt(i-1)){
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String word = "abbcccc";
        System.out.println(possibleStringCount(word));
    }
}
