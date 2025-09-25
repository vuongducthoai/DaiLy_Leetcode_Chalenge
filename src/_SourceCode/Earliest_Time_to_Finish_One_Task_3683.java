package _SourceCode;

public class Earliest_Time_to_Finish_One_Task_3683 {
    public static int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < tasks.length; i++){
            int sum = 0;
            sum = tasks[i][0] + tasks[i][1];
            min = Math.min(sum, min);
        }
        return min;
    }

    public static void main(String[] args) {
        int taks[][] = {{100, 100}, {100, 200}, {200, 500}};
        System.out.println(earliestTime(taks));
    }
}
