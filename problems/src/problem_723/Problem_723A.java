package problem_723;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_723A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int median = Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
        int result = Math.abs(median - a) + Math.abs(median - b) + Math.abs(median - c);
        System.out.print(result);
    }
}