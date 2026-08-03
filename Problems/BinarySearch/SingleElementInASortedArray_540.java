class SingleElementInASortedArray_540 {

    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3,3,4,4,8,8,10};
        SingleElementInASortedArray_540 solution = new SingleElementInASortedArray_540();
        System.out.println(solution.singleNonDuplicate(nums));
    }
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }else if(nums[0] != nums[1]){
            return nums[0]; 
        }else if(nums[nums.length -1] != nums[nums.length -2]){
            return nums[nums.length -1];
        }
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if(nums[mid] != nums[mid -1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }else if(mid % 2 == 0){
                if(nums[mid] == nums[mid +1]){
                    start = mid +2;
                }else{
                    end = mid -1;
                }
            }else{
                if(nums[mid] == nums[mid -1]){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}