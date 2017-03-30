package problem_476;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_476A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int divisor = in.nextInt();

        int temp;
        if (number % 2 == 0)
            temp = number / 2;
        else
            temp = number / 2 + 1;

        int result = -1;
        for (int i = temp; i <= number; i++) {
            if (i % divisor == 0) {
                result = i;
                break;
            }
        }

        System.out.print(result);
    }
}