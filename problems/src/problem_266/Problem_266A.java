package problem_266;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_266A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String input = in.nextLine();

        int count = 0;
        char one, two;
        one = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            two = input.charAt(i);
            if (one == two)
                count++;
            one = two;
        }
        System.out.print(count);
    }
}