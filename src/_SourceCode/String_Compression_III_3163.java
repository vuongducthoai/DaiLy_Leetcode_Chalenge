package _SourceCode;
public class String_Compression_III_3163 {
    public static String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = word.charAt(0);
        for(int i = 1; i < word.length(); i++) {
            if(prev != word.charAt(i)) {
                sb.append(count).append(prev);
                prev = word.charAt(i);
                count = 1;
            } else {
                if(count == 9){
                    sb.append(count).append(prev);
                    count = 1;
                } else {
                    count++;
                }
            }
        }
        sb.append(count).append(prev);
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        System.out.println(compressedString(word));
    }
}
