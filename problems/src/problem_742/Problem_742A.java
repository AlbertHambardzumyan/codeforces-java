package problem_742;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_742A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int[] array = {6, 8, 4, 2};
        int result = input == 0 ? 1 : array[input % 4];

        System.out.print(result);
    }
}