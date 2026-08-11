class FindPivotIndex_724{
    public static void main(String[] args){

        int[] nums = {1,7,3,6,5,6};
        System.out.println(findPivotIndex(nums));
        
    }
    public static int findPivotIndex(int[] nums) {
        int rsum  =0;
        for(int ele : nums){
            rsum += ele;
        }
        int lsum = 0;
        for(int i=0; i<nums.length; i++){   
            rsum -= nums[i];
            if(lsum == rsum){
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }
}