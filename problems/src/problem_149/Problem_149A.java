package problem_149;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_149A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int[] array = new int[12];

        for (int i = 0; i < 12; i++)
            array[i] = in.nextInt();

        int result = 0;
        if (height != 0) {
            Arrays.sort(array);
            int temp = 0;
            int i = 11;
            while (temp < height && i > -1) {
                temp += array[i];
                i--;
            }
            result = 11 - i;
            if (result == 12 && temp < height)
                result = -1;
        }

        System.out.print(result);
    }
}