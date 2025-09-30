package _SourceCode;

public class Count_Pairs_That_Form_a_Complete_Day_I_3184 {
    public static int countCompleteDayPairs(int[] hours) {
        int count = 0;
        for(int i = 0; i < hours.length - 1; i ++){
            for(int j = i + 1; j < hours.length; j ++){
                if((hours[i] + hours[j]) % 24 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int hours[] = {12, 12, 30, 24, 24};
        System.out.println(countCompleteDayPairs(hours));
    }

}
