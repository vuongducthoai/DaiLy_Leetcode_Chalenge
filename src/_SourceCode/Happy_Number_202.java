package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number_202 {

    public static int nextNumber(int n) {
        int sum = 0;
        while(n != 0) {
            int k = n % 10;
            sum += k * k;
            n /= 10;
        }
        return sum;

    }

    public static boolean isHappy(int n) {
        Set<Integer> existNumbers = new HashSet<Integer>();
        while(existNumbers.contains(n) == false) {
            if(n == 1) {
                return true;
            }
            existNumbers.add(n);
            n = nextNumber(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
