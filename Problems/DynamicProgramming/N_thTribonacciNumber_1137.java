package Problems.DynamicProgramming;

public class N_thTribonacciNumber_1137 {

    public static void main(String[] args) {
        int n = 25;
        System.out.println(tribonacci(n));
    }

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int prev3 = 0;
        int prev2 = 1;
        int prev1 = 1;

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2 + prev3;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}