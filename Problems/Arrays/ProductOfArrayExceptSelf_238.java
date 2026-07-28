

public class ProductOfArrayExceptSelf_238{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        printArray(ans);
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        int[] ans = new int[n];
        int pro = 1;

        for(int i=n-1; i>=0;i--){
            pro = pro*nums[i];
            right [i] = pro; 
        }
        int left =1;
        for(int i=0; i<n-1;i++){
            ans[i] = left*right[i+1];
            left = left*nums[i];

        }
        ans[n-1]=left;

        return ans;
    }
}