package problem_4;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_4A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();

        if (weight % 2 == 1 || weight <= 2)
            System.out.print("NO");
        else {
            System.out.print("YES");
        }
    }
}