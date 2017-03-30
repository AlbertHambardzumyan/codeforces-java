package problem_551;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_551A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++)
            array[i] = in.nextInt();

        int[] clone = array.clone();
        Arrays.sort(clone);

        int[] rankArray = new int[clone[clone.length - 1]];
        int temp = 1 + clone[clone.length - 1];
        int rank = 1;
        for (int i = clone.length - 1; i >= 0; i--) {
            if (clone[i] < temp) {
                rankArray[clone[i] - 1] = rank;
                temp = clone[i];
            }
            rank++;
        }
        for (int anArray : array) System.out.print(rankArray[anArray - 1] + " ");
    }
}