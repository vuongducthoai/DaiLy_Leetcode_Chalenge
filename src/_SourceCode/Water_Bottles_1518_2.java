package _SourceCode;

public class Water_Bottles_1518_2 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            ans += newBottles;
            int remBottles = numBottles % numExchange;
            numBottles = newBottles + remBottles;
        }
        return ans;
    }

    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }


}
