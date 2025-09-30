package _SourceCode;

public class Minimum_Cost_to_Reach_Every_Position_3502 {
    public static int[] minCosts(int[] cost) {
        int totalPositions = cost.length;
        int[] minimumCosts = new int[totalPositions];
        int currentMinimum = cost[0];

        for(int position = 0; position < totalPositions; position++){
            if(cost[position] < currentMinimum){
                currentMinimum = cost[position];
            }
            minimumCosts[position] = currentMinimum;
        }
        return minimumCosts;
    }

    public static void main(String[] args) {
        int cost[] = {5,3, 4, 1, 3, 2};
        System.out.println(minCosts(cost));
    }
}
