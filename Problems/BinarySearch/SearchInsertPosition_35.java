class SearchInsertPosition_35{
    public static void main(String[] args){

        int[] nums = {1,3,5,6};
        int target = 85;     
        SearchInsertPosition_35 solution = new SearchInsertPosition_35();
        System.out.println(solution.searchInsert(nums, target));
    }
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = (start + end ) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
}