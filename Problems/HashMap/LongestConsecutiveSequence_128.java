import java.util.HashMap;

class LongestConsecutiveSequence_128{
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        LongestConsecutiveSequence_128 obj = new LongestConsecutiveSequence_128();
        System.out.println(obj.longestConsecutive(nums));
    }
    public int longestConsecutive(int[] nums) {
        HashMap <Integer,Boolean> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], false);
        }

        for(int key : map.keySet()){
            if(map.containsKey(key-1) == false){
                map.put(key, true);
            }
        }
        int max = 0;
        for(int key : map.keySet()){
            int count =1;
            if(map.get(key) == true){
                while(map.containsKey(key+count)){
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}