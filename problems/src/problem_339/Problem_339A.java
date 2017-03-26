package problem_339;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_339A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int[] array = new int[4];

        for (int i = 0; i < input.length(); i += 2)
            array[input.charAt(i) - 48]++;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array[1]; i++)
            result.append(1 + "+");
        for (int i = 0; i < array[2]; i++)
            result.append(2 + "+");
        for (int i = 0; i < array[3]; i++)
            result.append(3 + "+");

        System.out.print(result.substring(0, result.length() - 1));
    }
}