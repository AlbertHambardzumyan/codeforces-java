package problem_822;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_822A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int min = Math.min(a, b);

        System.out.print(factorial(min));
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) return 1;

        return n * factorial(n - 1);
    }
}