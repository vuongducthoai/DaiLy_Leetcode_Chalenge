package _SourceCode;

public class Find_Smallest_Letter_Greater_Than_Target_744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int l = 0, r = n  - 1;
        char ans = letters[0];
        while(l <= r){
            int  mid = (l + r) / 2;
            if(letters[mid] <= target) {
                l = mid + 1;
            } else if(letters[mid] > target){
                ans = letters[mid];
                r = mid ;
            }else{
                l++;
                r--;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        char letters[] = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'c'));
    }
}
