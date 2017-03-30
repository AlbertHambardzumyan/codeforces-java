package problem_208;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_208A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String sub;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i + 2 < input.length())
                sub = input.substring(i, i + 3);
            else {
                result.append(input.substring(i, input.length()));
                break;
            }

            if (sub.equals("WUB")) {
                if (i != 0)
                    result.append(" ");
                i += 2;
            } else {
                result.append(sub.substring(0, 1));
            }
        }
        System.out.print(result);
    }
}