package problem_519;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_519B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();
        int[] array1 = new int[number - 1];
        for (int i = 0; i < array1.length; i++)
            array1[i] = in.nextInt();
        int[] array2 = new int[number - 2];
        for (int i = 0; i < array2.length; i++)
            array2[i] = in.nextInt();


        Arrays.sort(array);
        Arrays.sort(array1);
        Arrays.sort(array2);

        int result = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array[i] != array1[i]) {
                result = array[i];
                break;
            }
        }
        if (result == 0)
            result = array[array.length - 1];
        System.out.println(result);
        result = 0;

        for (int i = 0; i < array2.length; i++) {
            if (array1[i] != array2[i]) {
                result = array1[i];
                break;
            }
        }
        if (result == 0)
            result = array1[array1.length - 1];

        System.out.println(result);
    }
}