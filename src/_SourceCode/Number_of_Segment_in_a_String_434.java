package _SourceCode;

public class Number_of_Segment_in_a_String_434 {
    public static int countSegments(String s) {
        if(s.length() == 0 || s.trim().length() == 0){
            return 0;
        }
        String[] arr = s.trim().replaceAll("\\s+"," ").split(" ");
        return arr.length;
    }

    static void main() {
        String s = ", , , ,        a, eaefa";  // Output = 6
        System.out.println(countSegments(s));
    }
}
