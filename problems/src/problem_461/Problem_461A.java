package problem_461;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_461A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();
        Arrays.sort(array);

        long total = 0;
        for (int anArray : array) total += anArray;

        long result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            result += total;
            result += array[i];
            total = total - array[i];
        }
        result += total;

        System.out.print(result);
    }
}