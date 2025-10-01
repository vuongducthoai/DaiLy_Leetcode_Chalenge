package _SourceCode;

public class Harshad_Number_3099 {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        String number = String.valueOf(x);
        for(char c : number.toCharArray()){
            sum += (c - '0');
        }
        if(x % sum == 0){
            return sum;
        }
        return -1;

    }

    public static void main(String[] args) {
        int x = 18;
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }
}
