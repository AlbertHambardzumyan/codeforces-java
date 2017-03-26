package problem_133;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_133A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        char temp;
        String result = "NO";

        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            if (temp == 'H' || temp == 'Q' || temp == '9') {
                result = "YES";
                break;
            }
        }
        System.out.print(result);
    }
}