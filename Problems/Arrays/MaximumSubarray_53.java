class MaximumSubarray_53 {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray_53 obj = new MaximumSubarray_53();
        System.out.println(obj.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}