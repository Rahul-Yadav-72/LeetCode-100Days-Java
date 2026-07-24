package Problems.DynamicProgramming;

import java.util.Scanner;

public class FibonacciNumber_509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n);
            sc.close();
            return;
        }

        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        System.out.println(prev1);

        sc.close();
    }
}