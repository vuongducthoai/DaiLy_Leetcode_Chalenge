package _SourceCode;

public class Robot_Return_to_Origin_657 {
    public static boolean judgeCircle(String moves) {
        int r = 0, u = 0;
        for(int i = 0; i < moves.length(); i ++){
            if(moves.charAt(i) == 'L'){
                r--;
            } else if(moves.charAt(i) == 'R'){
                r++;
            } else if(moves.charAt(i) == 'U'){
                u++;
            } else {
                u--;
            }
        }
        return r == 0 && u == 0;
    }

    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
}
