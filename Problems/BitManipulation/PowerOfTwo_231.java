public class PowerOfTwo_231 {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PowerOfTwo_231 obj = new PowerOfTwo_231();
        System.out.println(obj.isPowerOfTwo(16));
        System.out.println(obj.isPowerOfTwo(15));
    }

}