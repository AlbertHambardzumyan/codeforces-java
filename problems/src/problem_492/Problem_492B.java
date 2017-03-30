package problem_492;

import java.util.Arrays;
import java.util.Scanner;


/**
 * * Created by Alik on 11/9/2015.
 */
public class Problem_492B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int length = in.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();
        Arrays.sort(array);

        double max = 0;
        double temp;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[0] != 0) {
                temp = array[0];
                if (max < temp)
                    max = temp;
            }
            if (i == array.length - 1 && array[array.length - 1] != length) {
                temp = length - array[array.length - 1];
                if (max < temp)
                    max = temp;
            } else if (i + 1 < array.length) {
                temp = (double) (array[i + 1] - array[i]) / 2;
                if (max < temp)
                    max = temp;
            }
        }

        System.out.print(max);
    }
}