package problem_758;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_758A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        int max = 0;
        for (int anArray : array) if (anArray > max) max = anArray;

        int count = 0;
        for (int anArray : array) count += max - anArray;

        System.out.print(count);
    }
}