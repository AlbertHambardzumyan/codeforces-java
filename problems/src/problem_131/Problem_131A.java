package problem_131;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_131A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String result = "";

        if (input.charAt(0) > 96 && input.charAt(0) < 123) {
            result += (char) (input.charAt(0) - 32);
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) > 64 && input.charAt(i) < 97) {
                    result += (char) (input.charAt(i) + 32);
                } else {
                    result = input;
                    break;
                }
            }
            System.out.print(result);
        } else if (input.charAt(0) > 64 && input.charAt(0) < 97) {
            result += (char) (input.charAt(0) + 32);
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) > 64 && input.charAt(i) < 97) {
                    result += (char) (input.charAt(i) + 32);
                } else {
                    result = input;
                    break;
                }
            }
            System.out.print(result);
        }
    }
}