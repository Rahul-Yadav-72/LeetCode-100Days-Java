package Problems.Arrays;
import java.util.ArrayList;
import java.util.List;
public class FindTargetIndicesAfterSortingArray_2089 {

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        FindTargetIndicesAfterSortingArray_2089 obj = new FindTargetIndicesAfterSortingArray_2089();
        System.out.println(obj.targetIndices(nums, target));
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        int num = 0;
        int tcount =0;
        for(int element : nums){
            if(element == target){
                tcount++;
            }
            if(element < target){
                num++;
            }
        }
        List<Integer> ans = new ArrayList<>();

        while(tcount > 0){
            ans.add(num);
            num++;
            tcount--;
        }
        return ans;
    }
}