package problem_472;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_472A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int result = 0;

        for (int i = 4; i < input; i++) {
            if (composite(i, input - i)) {
                result = i;
                break;
            }
        }
        System.out.print(result + " " + (input - result));
    }

    private static boolean composite(int a, int b) {
        if (checkPrime(a)) {
            if (checkPrime(b))
                return true;
        }
        return false;
    }

    private static boolean checkPrime(int a) {
        int temp = (int) Math.sqrt(a) + 1;
        for (int i = 2; i < temp; i++) {
            if (a % i == 0)
                return true;
        }
        return false;
    }
}