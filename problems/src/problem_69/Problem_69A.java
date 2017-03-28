package problem_69;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_69A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[][] array = new int[number][3];
        String result = "YES";

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = in.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < number; j++) {
                sum += array[j][i];
            }
            if (sum != 0) {
                result = "NO";
                break;
            }
        }
        System.out.print(result);
    }
}