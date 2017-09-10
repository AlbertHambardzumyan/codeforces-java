package problem_672;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_672A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        StringBuilder string = new StringBuilder();
        for (int i = 1; i <= n; i++)
            string.append(i);

        System.out.print(string.charAt(n - 1));
    }
}