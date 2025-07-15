package _SourceCode;

public class Valid_Word_3136 {
    public static boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        boolean isVowel = false;
        boolean isConsonant = false;
        String vowel = "aeiou";
        for(int i = 0; i < word.length(); i ++){
            char c = word.charAt(i);
            if(vowel.indexOf(Character.toLowerCase(c)) >= 0){
                isVowel = true;
            } else if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                isConsonant = true;
            } else {
                return false;
            }
        }
        if( isVowel && isConsonant){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String word = "234Adas";
        System.out.println(isValid(word));
    }
}
