package problem_404;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_404A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine();

        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            String line = in.nextLine();
            for (int j = 0; j < size; j++)
                array[i][j] = (int) line.charAt(j);

        }

        String result = "YES";
        int ex1 = array[0][0];
        int ex2 = array[0][1];
        if (ex1 == ex2) result = "NO";
        else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j || j == size - 1 - i) {
                        if (array[i][j] != ex1) {
                            result = "NO";
                            i = size;
                            break;
                        }
                    } else {
                        if (array[i][j] != ex2) {
                            result = "NO";
                            i = size;
                            break;
                        }
                    }
                }
            }
        }

        System.out.print(result);
    }
}