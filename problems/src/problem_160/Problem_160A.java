package problem_160;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_160A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        int sum = 0;
        for (int anArray : array) sum += anArray;
        Arrays.sort(array);

        int temp = 0;
        int index = array.length - 1;
        int result = 0;
        while (temp <= sum / 2) {
            temp += array[index];
            index--;
            result++;
        }

        System.out.print(result);
    }
}