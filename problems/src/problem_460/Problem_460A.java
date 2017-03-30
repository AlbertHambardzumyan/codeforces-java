package problem_460;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_460A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int interval = in.nextInt();

        int count = 0;
        count += number;
        int temp, remainder;
        while (number / interval > 0) {
            remainder = number % interval;
            temp = number / interval;
            count += temp;
            number = temp + remainder;
        }
        System.out.print(count);
    }
}