package problem_379;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_379A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int newCandle = in.nextInt();
        int oldCandle = in.nextInt();

        int hours = newCandle;
        int temp, remainder;

        temp = newCandle / oldCandle;
        remainder = newCandle % oldCandle;
        while (temp > 0) {
            hours += temp;
            newCandle = temp + remainder;
            temp = newCandle / oldCandle;
            remainder = newCandle % oldCandle;
        }
        System.out.print(hours);
    }
}