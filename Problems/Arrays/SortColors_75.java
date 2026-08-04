class SortColors_75{
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        SortColors_75 obj = new SortColors_75();
        obj.sortColors(nums);
        obj.printArray(nums);
    }
    public void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public  void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length -1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
}