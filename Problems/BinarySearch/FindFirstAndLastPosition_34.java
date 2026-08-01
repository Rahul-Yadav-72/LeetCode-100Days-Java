public class FindFirstAndLastPosition_34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 0;
        int[] ans = new FindFirstAndLastPosition_34().searchRange(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
        
        
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = firstOccurrence(nums, target);
        ans[1] = secondOccurrence(nums, target);
        return ans;
    }
    public int firstOccurrence(int[] nums, int target){
        int start =0;
        int end = nums.length -1;
        int ans = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                ans = mid;
                end = mid -1;
            }else if(nums[mid] < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
    public int secondOccurrence(int[] nums, int target){
        int start =0;
        int end = nums.length -1;
        int ans = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                ans = mid;
                start = mid +1;
            }else if(nums[mid] < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
    
}
