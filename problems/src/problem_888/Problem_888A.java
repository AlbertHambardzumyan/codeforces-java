package problem_888;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_888A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int result = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 1; i < size; i++) {
            if (array[i] > array[i - 1] && i + 1 < array.length && array[i] > array[i + 1]) result++;
            else if (array[i] < array[i - 1] && i + 1 < array.length && array[i] < array[i + 1]) result++;
        }

        System.out.print(result);
    }
}