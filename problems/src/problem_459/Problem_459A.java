package problem_459;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_459A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int diffX = Math.abs(x2 - x1);
        int diffY = Math.abs(y2 - y1);

        if (diffX == diffY)
            System.out.print(x1 + " " + y2 + " " + x2 + " " + y1);
        else if (diffY == 0)
            System.out.print(x1 + " " + (y1 + diffX) + " " + x2 + " " + (y1 + diffX));
        else if (diffX == 0)
            System.out.print((x2 + diffY) + " " + y2 + " " + (x1 + diffY) + " " + y1);
        else
            System.out.print(-1);
    }
}