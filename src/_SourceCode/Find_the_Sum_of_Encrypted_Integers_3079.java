package _SourceCode;

public class Find_the_Sum_of_Encrypted_Integers_3079 {
    public static int encrypt(int num){
        String number = String.valueOf(num);
        int max = Integer.MIN_VALUE;
        for(char c : number.toCharArray()){
            max = Math.max(max, c - '0');
        }

        String result = String.valueOf(max).repeat(number.length());
        return Integer.valueOf(result);
    }

    public static int sumOfEncryptedInt(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i ++){
            ans += encrypt(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2, 3};
        System.out.println(sumOfEncryptedInt(nums));
    }
}
