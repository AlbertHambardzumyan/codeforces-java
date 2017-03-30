package problem_268;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_268B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input < 4)
            System.out.print((input - 1) * input + 1);
        else {
            int count = input + 1;
            for (int i = 2; i < input; i++) {
                count += i * (input - i) + 1;
            }
            System.out.print(count);
        }
    }
}