package problem_282;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_282A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iterations = in.nextInt();
        in.nextLine();

        int x = 0;
        String temp;
        for (int i = 0; i < iterations; i++) {
            temp = in.nextLine();
            if (temp.charAt(0) == '+' || temp.charAt(2) == '+')
                x++;
            else
                x--;
        }
        System.out.print(x);
    }
}