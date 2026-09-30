package _SourceCode;

public class Hamming_Distance_461 {
    /*
        ^ là toán tu XOR
        Hai bit giống nhau -> 0
        Hai bit khác nhau -> 1

        & - AND
        Cả hai đều 1 -> 1
        Còn lại -> 0
     */
    public static int hammingDistance(int x, int y) {
        int n = x ^ y;
        String binary = Integer.toBinaryString(n);
        int cnt = 0;
        for(char c : binary.toCharArray()){
            if(c == '1'){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int x = 3, y = 1;
        System.out.println(hammingDistance(x, y));
    }
}
