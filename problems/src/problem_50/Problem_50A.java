package problem_50;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_50A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        System.out.print(m * n / 2);
    }
}