package problem_119;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_119A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int total = in.nextInt();

        while (total >= 0) {
            total = total - gcd(first, total);
            if (total < 0) {
                System.out.print(1);
                break;
            }
            total = total - gcd(second, total);
            if (total < 0)
                System.out.print(0);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}