package problem_337;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_337A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int students = in.nextInt();
        int availablePuzzle = in.nextInt();
        int[] array = new int[availablePuzzle];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        Arrays.sort(array);
        int temp;
        int max = 10001;
        for (int i = 0; i < array.length - students + 1; i++) {
            temp = array[students + i - 1] - array[i];
            if (max > temp)
                max = temp;
        }
        System.out.print(max);
    }
}