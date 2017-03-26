package problem_231;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_231A {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int iterations = in.nextInt();
        int first, second, third;
        int count = 0;

        for (int i = 0; i < iterations; i++) {
            first = in.nextInt();
            second = in.nextInt();
            third = in.nextInt();
            if ((first == 1 && second == 1) || (second == 1 && third == 1) || (first == 1 && third == 1))
                count++;
        }
        System.out.print(count);
    }
}