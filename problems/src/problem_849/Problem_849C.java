package problem_849;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_849C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        for (int i = 0; i < 26; i++) {
            int tmp = 0;
            while (tmp * (tmp + 1) / 2 <= k) tmp++;

            k -= tmp * (tmp - 1) / 2;

            for (int j = 1; j <= tmp; j++)
                System.out.print((char) ('a' + i));
        }
    }
}