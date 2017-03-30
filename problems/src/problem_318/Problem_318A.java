package problem_318;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_318A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        long position = in.nextLong();
        long lengthOdd;

        if (number % 2 == 0)
            lengthOdd = number / 2;
        else
            lengthOdd = number / 2 + 1;

        long count;
        if (position <= lengthOdd) {
            count = position * 2 - 1;
        } else {
            count = (position - lengthOdd) * 2;
        }
        System.out.print(count);
    }
}