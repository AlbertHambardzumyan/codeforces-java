package problem_327;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_327A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int count = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                for (int k = 0; k < array.length; k++) {
                    if (k >= i && k <= j && array[k] == 0)
                        count++;
                    else if ((k < i || k > j) && array[k] == 1)
                        count++;
                }

                if (count > result)
                    result = count;
                count = 0;
            }

        }

        System.out.print(result);
    }
}