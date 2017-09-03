package problem_849;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_849A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 == 0) System.out.print("No");
        else {
            int first = in.nextInt();
            int last = 1;
            for (int i = 0; i < n - 1; i++) last = in.nextInt();

            if (first * last % 2 == 1) System.out.print("Yes");
            else System.out.print("No");
        }
    }
}