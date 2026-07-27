package Problems.TwoPointers;

public class TwoSumII_167 {
    public static void main(String[] args) {
        int[] nums = {2,7,9,14,16,25};
        int target = 30;
        int[] ans = twoSum(nums,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
    public static int[] twoSum(int[] nums,int target){
        int[] ans = new int[2];
        int start =0;
        int end = nums.length-1;
        while(start<end){
            int sum = nums[start]+nums[end];
            if(sum == target){
                ans[0] = ++start;
                ans[1] = ++end;
                return ans;

            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return ans;
    }
    
}