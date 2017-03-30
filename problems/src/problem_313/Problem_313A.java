package problem_313;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_313A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if (Integer.parseInt(input) >= 0)
            System.out.print(input);
        else {
            int temp1 = Integer.parseInt(input.substring(0, input.length() - 1));
            int temp2 = Integer.parseInt(input.substring(0, input.length() - 2) + input.substring(input.length() - 1));
            System.out.print(Math.max(temp1, temp2));
        }
    }
}