package problem_96;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_96A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int zeroCount = 0, oneCount = 0;
        boolean result = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0') {
                zeroCount++;
                oneCount = 0;
            } else if (input.charAt(i) == '1') {
                oneCount++;
                zeroCount = 0;
            }

            if (oneCount == 7 || zeroCount == 7) {
                result = true;
                break;
            }
        }
        System.out.print(result ? "YES" : "NO");
    }
}