package problem_61;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_61A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();

        StringBuilder result = new StringBuilder();
        char one, two;

        for (int i = 0; i < first.length(); i++) {
            one = first.charAt(i);
            two = second.charAt(i);
            if (one != two)
                result.append("1");
            else
                result.append("0");
        }
        System.out.print(result);
    }
}