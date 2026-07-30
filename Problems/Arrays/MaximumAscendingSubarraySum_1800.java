package Problems.Arrays;

public class MaximumAscendingSubarraySum_1800 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 5, 10, 50 };
        System.out.println(maxAscendingSum(nums));
    }

    public static int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                maxSum = Math.max(maxSum, currentSum);
                currentSum = nums[i];
            }
        }
        return Math.max(maxSum, currentSum);
    }

}
