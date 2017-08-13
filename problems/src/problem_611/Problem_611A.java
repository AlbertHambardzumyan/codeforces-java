package problem_611;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_611A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.next();
        String week_month = in.next();

        int result;
        if (week_month.equals("week")) {
            if (number >= 5 && number < 7) result = 53;
            else result = 52;
        } else {
            if (number <= 29) result = 12;
            else if (number == 30) result = 11;
            else result = 7;
        }

        System.out.print(result);
    }
}