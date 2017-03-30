package problem_509;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_509A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] array = new int[size + 1][size + 1];

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1)
                    array[i][j] = 1;
                else
                    array[i][j] = array[i][j - 1] + array[i - 1][j];
            }
        }

        System.out.print(array[size][size]);
    }
}