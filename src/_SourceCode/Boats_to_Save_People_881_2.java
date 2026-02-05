package _SourceCode;

import java.util.Arrays;

public class Boats_to_Save_People_881_2 {
    public static int numRescueBoats(int[] people, int limit) {
        int boatCount = 0;
        Arrays.sort(people);
        int l = 0, r = people.length - 1;
        while( l <= r){
            if(people[l] + people[r] <= limit){
                l++;
                r--;
            } else {
                r--;
            }
            boatCount++;
        }
        return boatCount;
    }

    public static void main(String[] args) {
        int people[] = {1,2};
        System.out.println(numRescueBoats(people, 3));
    }
}
