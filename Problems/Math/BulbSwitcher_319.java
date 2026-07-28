package Problems.Math;

public class BulbSwitcher_319 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(bulbSwitch(n));
    }
    public static int bulbSwitch(int n){
        int count = 0;
        int i=1;
        while (i*i<=n){
            count++;
            i++;
        } 
        return count;
    }

    
}