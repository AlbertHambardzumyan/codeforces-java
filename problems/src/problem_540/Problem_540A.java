package problem_540;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_540A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String current = in.nextLine();
        String code = in.nextLine();

        int a, b, count = 0;
        for (int i = 0; i < current.length(); i++) {
            a = current.charAt(i) - 48;
            b = code.charAt(i) - 48;
            if (a > b) {
                if (a - b > 10 - a + b)
                    count += 10 - a + b;
                else
                    count += a - b;
            } else if (a < b) {
                if (b - a > 10 - b + a)
                    count += 10 - b + a;
                else
                    count += b - a;
            }
        }

        System.out.print(count);
    }
}