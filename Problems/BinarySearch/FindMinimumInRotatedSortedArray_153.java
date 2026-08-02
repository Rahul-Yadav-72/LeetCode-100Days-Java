class FindMinimumInRotatedSortedArray_153{
    public static void main(String[] args){
        int[] nums = {3,4,5,1,2};
        FindMinimumInRotatedSortedArray_153 obj = new FindMinimumInRotatedSortedArray_153();
        System.out.println(obj.findMin(nums));
    }
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }else if(nums[0] < nums[nums.length -1]){
            return nums[0];
        }
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(mid !=0 && nums[mid] < nums[mid -1]){
                return nums[mid];
            }else if(mid != nums.length-1 && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }else if(nums[mid] <= nums[end]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}