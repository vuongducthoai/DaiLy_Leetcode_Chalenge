package _SourceCode;

public class Smallest_Even_Multiple_2413 {
    public static int smallestEvenMultiple(int n) {
        if(n % 2 == 0){
            return n;
        }
        return n * 2;
    }

    static void main() {
        int n = 5;
        System.out.println(smallestEvenMultiple(n));
    }
}
