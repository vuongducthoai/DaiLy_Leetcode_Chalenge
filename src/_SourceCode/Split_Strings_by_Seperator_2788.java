package _SourceCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Split_Strings_by_Seperator_2788 {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        String regex = java.util.regex.Pattern.quote(Character.toString(separator));
        for(int i = 0; i < words.size(); i ++){
            String[] arr = words.get(i).split(regex);
            for(String s : arr){
                if(!s.isEmpty()){
                    ans.add(s);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"one.two.three", "four.five", "six"};
        List<String> list = Arrays.asList(words);
        System.out.println(splitWordsBySeparator(list, '.'));
    }
}
