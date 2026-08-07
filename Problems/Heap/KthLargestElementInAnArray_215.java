package Problems.Heap;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray_215 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 5;
        KthLargestElementInAnArray_215 obj = new KthLargestElementInAnArray_215();
        int ans = obj.findKthLargest(nums, k);      
        System.out.println(ans);
    }
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            if(pq.size() < k){
                pq.add(nums[i]);
            }else if(nums[i] > pq.peek()){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}
