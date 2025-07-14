package _SourceCode;

import java.util.Arrays;

public class Maximum_Matching_of_Players_With_Trainers_2410 {
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0;
        int j = 0;
        int ans = 0;
        while(i < players.length && j < trainers.length){
            if(players[i] <= trainers[j]){
                ans++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] players = {4, 7, 9};
        int[] trainers = {8, 2, 5 ,8};
        System.out.println(matchPlayersAndTrainers(players, trainers));
    }
}
