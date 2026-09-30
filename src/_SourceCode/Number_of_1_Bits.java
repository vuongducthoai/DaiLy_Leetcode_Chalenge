package _SourceCode;

public class Number_of_1_Bits {
    public static int hammingWeight(int n) {
        String binary = decimalToBinary(n);
        int cnt = 0;
        for(char c : binary.toCharArray()){
            if(c == '1'){
                cnt ++;
            }
        }
        return cnt;
    }

    public static String decimalToBinary(int n){
        if(n == 0){
            return "0";
        }

        String binary = "";
        while(n > 0){
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        int n = 2147483645;
        System.out.println(hammingWeight(n));
    }
}
