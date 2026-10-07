package _SourceCode;

public class Find_the_K_th_Character_in_String_Game_I_3304 {
    public static char kthCharacter(int k) {
        StringBuilder ans = new StringBuilder("a");
        while(ans.length() < k){
            int n = ans.length();
            for(int i = 0 ; i < n; i ++){
                ans.append((char)(ans.charAt(i) + 1));
            }
        }
        return ans.charAt(k - 1);
    }

    static void main() {
        int k = 5;
        System.out.println(kthCharacter(k));
    }
}
