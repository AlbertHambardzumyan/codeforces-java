package problem_515;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_515A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Math.abs(in.nextInt());
        int b = Math.abs(in.nextInt());
        int steps = in.nextInt();

        if (a + b == steps)
            System.out.print("YES");
        else if (a + b < steps && (steps - (a + b)) % 2 == 0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}