package _SourceCode;

public class Number_of_Changing_Keys_3019 {
    public static int countKeyChanges(String s){
        int ans = 0;
        String str = s.toLowerCase();
        for(int i = 1 ; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i - 1)){
                ans ++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "AaAaAaaA";
        System.out.println(countKeyChanges(s));
    }
}
