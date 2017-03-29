package problem_41;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_41A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = first.length() - 1; i >= 0; i--) {
            result.append(first.charAt(i));
        }
        if (result.toString().equals(second))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}