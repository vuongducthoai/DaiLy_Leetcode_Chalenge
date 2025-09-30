package _SourceCode;

public class Minimum_Number_of_Chairs_in_Waiting_Room_3168 {
    public static int minimumChairs(String s) {
        int currentOccupancy = 0;
        int maxOccupancy = 0;
        for(char event : s.toCharArray()){
            if(event == 'E'){
                currentOccupancy++;
            }else {
                currentOccupancy--;
            }
            if(currentOccupancy > maxOccupancy){
                maxOccupancy = currentOccupancy;
            }
        }
        return maxOccupancy;
    }

    public static void main(String[] args) {
        String s = "ELEELEELLL";
        System.out.println(minimumChairs(s));
    }
}
