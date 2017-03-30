package problem_25;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_25B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        in.nextLine();
        String input = in.nextLine();

        StringBuilder result = new StringBuilder();
        if (length % 2 == 0) {
            for (int i = 0; i < length; i += 2)
                result.append(input.substring(i, i + 2)).append("-");
        } else {
            result.append(input.substring(0, 3)).append("-");
            for (int i = 3; i < length; i += 2)
                result.append(input.substring(i, i + 2)).append("-");
        }

        System.out.print(result.substring(0, result.length() - 1));
    }
}