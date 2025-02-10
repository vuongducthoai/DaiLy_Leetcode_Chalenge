package _SourceCode;

public class Check_If_One_String_Swap_Can_Make_String_Equal_1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        int i = -1, j = -1;
        int count = 0;
        for(int k = 0; k < s1.length(); k ++){
            if(s1.charAt(k) != s2.charAt(k)){
                count++;
                if (i == -1) {
                    i = k;
                } else if(j == -1) {
                    j = k;
                }
            }
        }
        if(count == 0) {
            return true;
        }
        else if(count == 2 && s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)){
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }
}
