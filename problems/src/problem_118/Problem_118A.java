package problem_118;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_118A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toLowerCase();

        char temp;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            if (!(temp == 'a' || temp == 'o' || temp == 'y' || temp == 'e' || temp == 'u' || temp == 'i'))
                result.append(".").append(temp);
        }

        System.out.print(result);
    }
}