package _SourceCode;

public class Water_Bottles_II_3100 {
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int drink = numBottles;
        while(numBottles >= numExchange){
            drink++;
            numBottles = numBottles - numExchange + 1;
            numExchange++;
        }
        return drink;
    }

    public static void main(String[] args) {
        int numBottles = 10;
        int numExchange = 3;
        System.out.println(maxBottlesDrunk(numBottles, numExchange));
    }
}
