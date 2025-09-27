package _SourceCode;

public class GCD_of_Odd_and_Even_Sums_3658 {
    public static int gcd(int x, int y){
      if(y == 0){
          return x;
      }
      else {
          return gcd(y, x % y);
      }
    }

    public static int gcdOfOddEvenSums(int n) {
        return gcd(n*n, n * (n + 1));
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(gcdOfOddEvenSums(n));
    }
}
