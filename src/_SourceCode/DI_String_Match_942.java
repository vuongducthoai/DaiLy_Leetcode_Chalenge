package _SourceCode;

public class DI_String_Match_942 {
    public static int[] diStringMatch(String s) {
        int n = s.length();
        int result[] = new int[n + 1];
        int low = 0, high = n;
        for(int i = 0; i < n; i ++){
            if(s.charAt(i) == 'I'){
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n] = low;
        return result;
    }

    public static void main(String[] args) {
        String s = "IDID";
        System.out.println(diStringMatch(s));
    }
}
