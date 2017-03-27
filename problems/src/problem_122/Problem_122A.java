package problem_122;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_122A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String result = "NO";
        int[] array = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};

        for (int anArray : array) {
            if (input % anArray == 0) {
                result = "YES";
                break;
            }
        }

        System.out.print(result);
    }
}