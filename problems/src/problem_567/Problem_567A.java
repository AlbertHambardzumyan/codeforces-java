package problem_567;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_567A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int min1 = 2000000005, min2 = 2000000005, max1, max2;
        for (int i = 0; i < array.length; i++) {
            if (i - 1 >= 0)
                min1 = Math.abs(array[i] - array[i - 1]);
            if (i + 1 < array.length)
                min2 = Math.abs(array[i] - array[i + 1]);

            max1 = Math.abs(array[0] - array[i]);
            max2 = Math.abs(array[array.length - 1] - array[i]);

            System.out.println(Math.min(min1, min2) + " " + Math.max(max1, max2));
            min1 = 2000000005;
            min2 = 2000000005;
        }
    }
}