package problem_71;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_71A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iterations = in.nextInt();

        String input;
        int length;
        for (int i = 0; i <= iterations; i++) {
            input = in.nextLine();
            length = input.length();
            if (length <= 10)
                System.out.println(input);
            else
                System.out.println(input.substring(0, 1) + (length - 2) + input.substring(length - 1, length));
        }
    }
}