package problem_527;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_527A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        System.out.print(compute(a, b));
    }

    private static long compute(long a, long b) {
        long result = 0;
        long temp;
        while (a % b != 0) {
            temp = a % b;
            result += a / b;
            a = b;
            b = temp;
        }
        result += a / b;
        return result;
    }
}