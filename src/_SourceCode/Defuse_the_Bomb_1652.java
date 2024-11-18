package _SourceCode;

import java.util.Arrays;

public class Defuse_the_Bomb_1652 {
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if(k == 0){
            Arrays.fill(result, 0);
            return result;
        }

        int[] extendedCode = new int[n * 2];
        /*
            System.arraycopy(src, srcPos, dest, destPos, length)
               + src: mang nguon
               + srcPos: Vi tri bat dau trong mang nguon
               + dest: Mang dich
               + destPos: Vi tri bat dau trong mang dich
               + length: So luong phan tu can sao cheo
         */
        System.arraycopy(code, 0, extendedCode, 0, n);
        System.arraycopy(code, 0, extendedCode, n, n);

        int start = k > 0 ? 1 : n + k;
        int end = k > 0 ? k : n - 1;

        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += extendedCode[i];
        }

        for(int i = 0; i < n; i ++){
            result[i] = sum;
            sum -= extendedCode[start++];
            sum += extendedCode[++end];
        }

        return result;

    }

    public static void main(String[] args) {
        int code[] = {5, 7, 1, 4};
        int k = 3;
        System.out.println(decrypt(code, k));
    }
}
