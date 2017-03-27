package problem_110;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_110A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long input = in.nextLong();

        boolean result = lucky_counter(input);
        System.out.print(result ? "YES" : "NO");
    }

    private static boolean lucky_counter(long input) {
        int count = 0;
        while (input > 0) {
            long digit = input % 10;
            input = input / 10;
            if (digit == 4 || digit == 7)
                count++;
        }
        return count / 10 == 0 && (count == 4 || count == 7) || count / 10 != 0 && lucky_counter(count);
    }
}
