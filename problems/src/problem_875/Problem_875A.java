package problem_875;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_875A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int count = 0;
        StringBuilder result = new StringBuilder();
        int index = Math.max(1, number - 81);

        for (int i = index; i <= number; i++) {
            int sum = sumDigits(i) + i;

            if (sum == number) {
                count++;
                result.append(i).append("\n");
            }
        }

        System.out.println(count);
        System.out.print(result);
    }

    private static int sumDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}