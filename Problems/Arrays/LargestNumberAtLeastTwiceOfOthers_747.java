
class LargestNumberAtLeastTwiceOfOthers_747 {
    public static void main(String[] args) {
        int[] nums = { 3, 6, 1, 0 };
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
                k = i;
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }
        if (max >= 2 * smax) {
            return k;
        } else {
            return -1;
        }
    }
}