package Problems.TwoPointers;
import java.util.Arrays;
public class BoatsToSavePeople_881 {
    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;
        BoatsToSavePeople_881 obj = new BoatsToSavePeople_881();
        System.out.println(obj.numRescueBoats(people, limit));
    }
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length -1;
        int boats = 0;
        while(start <= end){
            if(people[start] + people[end] <= limit){
                start++;
                end--;
            }else{
                end--;
            }
            boats++;
        }
        return boats;
        
    }
}
