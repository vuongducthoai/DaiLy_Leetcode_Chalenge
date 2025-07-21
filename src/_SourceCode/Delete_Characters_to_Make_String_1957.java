package _SourceCode;

public class Delete_Characters_to_Make_String_1957 {
    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(s.charAt(0));
        char tmp = s.charAt(0);
        for(int i = 1; i < s.length(); i ++){
            if(s.charAt(i) == tmp){
                count++;
                if(count < 3){
                    sb.append(s.charAt(i));
                }
            } else {
                count = 1;
                tmp = s.charAt(i);
                sb.append(tmp);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "leeetcode";
        System.out.println(makeFancyString(s));
    }
}
