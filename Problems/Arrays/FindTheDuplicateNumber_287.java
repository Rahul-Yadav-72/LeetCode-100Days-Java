public class FindTheDuplicateNumber_287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        FindTheDuplicateNumber_287 obj = new FindTheDuplicateNumber_287();      
        System.out.println(obj.findDuplicate(nums));
    }
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        fast = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
