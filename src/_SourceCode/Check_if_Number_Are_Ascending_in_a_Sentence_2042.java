package _SourceCode;

public class Check_if_Number_Are_Ascending_in_a_Sentence_2042 {
    public static boolean areNumbersAscending(String s) {
        int prev = 0;
        for(String token : s.split(" ")){
            try {
                int number = Integer.parseInt(token);
                if(number <= prev){
                    return false;
                }
                prev = number;
            } catch (Exception e){
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }
}
