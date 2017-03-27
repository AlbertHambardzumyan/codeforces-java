package problem_467;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_467A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int first, second, count = 0;
        for (int i = 0; i < number; i++) {
            first = in.nextInt();
            second = in.nextInt();
            if (second - first >= 2)
                count++;
        }
        System.out.print(count);
    }
}