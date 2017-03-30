package problem_584;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_584A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberLong = in.nextInt();
        int divisibleBy = in.nextInt();

        if (divisibleBy != 10) {
            for (int i = 0; i < numberLong; i++) {
                System.out.print(divisibleBy);
            }
        } else {
            if (numberLong == 1)
                System.out.print(-1);
            else {
                System.out.print(1);
                for (int i = 0; i < numberLong - 1; i++) {
                    System.out.print(0);
                }
            }
        }
    }
}