package problem_913;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_913A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        double result = m % Math.pow(2, n);

        System.out.println((int) result);
    }
}
