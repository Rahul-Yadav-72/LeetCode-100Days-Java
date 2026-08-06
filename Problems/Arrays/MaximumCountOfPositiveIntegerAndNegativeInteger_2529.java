class MaximumCountOfPositiveIntegerAndNegativeInteger_2529{
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, -1, 2, 3};
        MaximumCountOfPositiveIntegerAndNegativeInteger_2529 solution = new MaximumCountOfPositiveIntegerAndNegativeInteger_2529();
        int result = solution.maximumCount(nums);
        System.out.println(result); 
    }
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        
        for (int num : nums) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}