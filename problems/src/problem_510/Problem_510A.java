package problem_510;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_510A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < column; j++) {
                if ((i % 2 == 1)) {
                    System.out.print("#");
                } else {
                    if (((i / 2) % 2 == 1 && j == column - 1) || ((i / 2) % 2 == 0 && j == 0))
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}