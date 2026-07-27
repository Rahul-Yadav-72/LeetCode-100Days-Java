package Problems.TwoPointers;


public class SortedSquares_977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start =0;
        int end = nums.length-1;
        int ptr  = ans.length-1;
        while(start <= end){
            int ss = nums[start]*nums[start];
            int ee = nums[end]*nums[end];
            if(ss > ee){
                ans[ptr] = ss;
                start++;
            }else{
                ans[ptr] = ee;
                end--;
            }
            ptr--;
        } 
        return ans;
    }
    
}