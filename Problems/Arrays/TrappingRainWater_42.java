package Problems.Arrays;
public class TrappingRainWater_42 {

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater_42 obj = new TrappingRainWater_42();  
        System.out.println(obj.trap(height));
    }
    public int trap(int[] height){
        int n = height.length;

        //left max array
        int[] left = new int[n];
        left[0] = height[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        //right max array
        int[] right = new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        //calculate water trapped
        int trapWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(left[i],right[i]);
            trapWater += waterLevel - height[i];
        }
        return trapWater;
    }
}