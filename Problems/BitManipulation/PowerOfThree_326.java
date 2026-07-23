public class PowerOfThree_326 {

    // public boolean isPowerOfThree(int n) {
    //     if (n <= 0) {
    //         return false;
    //     }

    //     while (n % 3 == 0) {
    //         n /= 3;
    //     }

    //     return n == 1;
    // }

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        PowerOfThree_326 obj = new PowerOfThree_326();

        System.out.println(obj.isPowerOfThree(27)); 
        System.out.println(obj.isPowerOfThree(45)); 
        
    }
}