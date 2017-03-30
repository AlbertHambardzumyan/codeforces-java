package problem_580;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_580A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        int temp;
        int count = 1;
        int result = count;
        for (int i = 1; i < array.length; i++) {
            temp = array[i - 1];
            if (array[i] < temp) {
                if (result < count)
                    result = count;
                count = 1;
            } else
                count++;
        }
        if (result < count)
            result = count;
        System.out.print(result);
    }
}