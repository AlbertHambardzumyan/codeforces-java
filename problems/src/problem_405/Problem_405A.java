package problem_405;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_405A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}