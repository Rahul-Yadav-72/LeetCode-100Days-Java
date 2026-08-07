import java.util.*;
class PlusOne_66{
    public static void main(String[] args){

        int[] digits = {9,9,9};
        PlusOne_66 obj = new  PlusOne_66();
        int[] ans = obj.plusOne(digits);
        System.out.println(Arrays.toString(ans));

    }
    public int[] plusOne(int[] digits){
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }
}