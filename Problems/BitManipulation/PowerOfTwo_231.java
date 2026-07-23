public class PowerOfTwo_231 {
    // public boolean isPowerOfTwo(int n) {
    //     if (n <= 0) {
    //         return false;
    //     }
    //     while (n % 2 == 0) {
    //         n /= 2;
    //     }
    //     return n == 1;
    // }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo_231 obj = new PowerOfTwo_231();

        System.out.println(obj.isPowerOfTwo(27)); 
        System.out.println(obj.isPowerOfTwo(16)); 
        

        
    }
}