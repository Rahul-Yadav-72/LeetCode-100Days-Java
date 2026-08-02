public class FindPeakElement_162 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        FindPeakElement_162 obj = new FindPeakElement_162();        
        System.out.println(obj.findPeakElement(nums));
    }
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            //{1,2,3,1}
            int mid = (start + end) / 2;
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
            
        }
        return start;
    }
    public int findPeakElements(int[] nums) {
        if(nums.length-1 == 0){
            return 0;
        }else if(nums[0] > nums[1]){
            return 0;
        }else if(nums[nums.length-1] > nums[nums.length-2]){
            return nums.length-1;
        }else{
            int start = 1;
            int end = nums.length-2;
            while(start <= end){
                int mid = (start + end) /2;
                if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                    return mid;
                }else if(nums[mid] < nums[mid-1]){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
