package _SourceCode;

public class Find_Closet_Person_3516 {
    public static int findClosest(int x, int y, int z) {
        int d1 = Math.abs(x - z);
        int d2 = Math.abs(y - z);
        if(d1 < d2) return 1;
        if(d1 > d2) return 2;
        return 0;
    }

    public static void main(String[] args) {
        int x = 2, y = 7, z = 4;
        System.out.println(findClosest(x, y ,z));
    }
}
