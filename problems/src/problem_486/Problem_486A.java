package problem_486;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_486A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long input = in.nextLong();
        long result = 0;

        if (input < 10) {
            for (int i = 1; i <= input; i++)
                result += sign(i);
        } else {
            if (input % 2 == 1)
                result = (input / 2 + 1) * (-1);
            else
                result = input / 2;
        }

        System.out.print(result);
    }

    private static int sign(int a) {
        if (a % 2 == 1)
            return a * -1;
        else
            return a;
    }
}