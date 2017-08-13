package problem_127;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_127A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        int k = in.nextInt();

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        double distance = 0;
        for (int i = 1; i < lines; i++) {
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            distance += Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            x1 = x2;
            y1 = y2;
        }

        System.out.print(k * distance / 50);
    }
}