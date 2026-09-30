package _SourceCode;

public class Excel_Sheet_Column_Number_171 {
    public static int titleToNumber(String columnTitle) {
        long ans = 0;
        for(int i = 0; i < columnTitle.length(); i ++){
            char ch = columnTitle.charAt(i);
            ans = ans * 26 + (ch - 'A' + 1);
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }
}
