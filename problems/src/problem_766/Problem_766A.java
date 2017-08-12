package problem_766;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_766A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();

        int result;
        result = a.equals(b) ? -1 : Integer.max(a.length(), b.length());

        System.out.print(result);
    }
}