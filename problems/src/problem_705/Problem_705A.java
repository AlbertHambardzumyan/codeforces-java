package problem_705;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_705A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i != number && i % 2 == 0) System.out.print("I love that ");
            else if (i != number && i % 2 == 1) System.out.print("I hate that ");
            else if (i == number && i % 2 == 0) System.out.print("I love it");
            else if (i == number && i % 2 == 1) System.out.print("I hate it");
        }
    }
}