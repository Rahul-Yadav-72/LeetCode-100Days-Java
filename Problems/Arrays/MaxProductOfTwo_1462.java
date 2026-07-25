package Problems.Arrays;

public class MaxProductOfTwo_1462 {

    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        int max = -1;
        int smax = -1;
        for(int i=0; i<nums.length;i++){
            if(max<nums[i]){
                smax = max;
                max = nums[i];
            }else if(smax < nums[i]){
                smax = nums[i];
            }
        }
        int ans = (max-1)*(smax-1);
        System.out.println(ans);
    }
}