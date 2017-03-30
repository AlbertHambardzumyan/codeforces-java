package problem_579;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_579A {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.print(check(number));
    }

    private static int check(int number) {
        if (number < 2 && number != 0)
            return ++count;
        else if (number == 0)
            return count;


        int current = 1;
        while (current * 2 <= number)
            current *= 2;
        count++;
        return check(number - current);
    }
}