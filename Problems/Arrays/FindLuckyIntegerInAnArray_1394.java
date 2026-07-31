package Problems.Arrays;

import java.util.HashMap;

public class FindLuckyIntegerInAnArray_1394 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max = -1;
        for(int key : map.keySet()){
            if(key == map.get(key)){
                max = Math.max(max, key);
            }
        }
        return max;
    }
}
