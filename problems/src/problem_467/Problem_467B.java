package problem_467;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_467B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        int players = in.nextInt();
        int difference = in.nextInt();
        int[] array = new int[players];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        Arrays.sort(array);
        int maxSize = Integer.toBinaryString(array[array.length - 1]).length();
        StringBuilder soldier = new StringBuilder(Integer.toBinaryString(in.nextInt()));
        if (soldier.length() >= maxSize)
            maxSize = soldier.length();
        else {
            while (soldier.length() != maxSize)
                soldier.insert(0, "0");
        }


        StringBuilder temp;
        int count, k;
        int result = 0;
        for (int anArray : array) {
            temp = new StringBuilder(Integer.toBinaryString(anArray));
            while (temp.length() != maxSize)
                temp.insert(0, "0");
            count = 0;
            k = 1;
            for (int j = 0; j < maxSize; j++) {
                if (temp.charAt(j) != soldier.charAt(j))
                    count++;
                if (count > difference) {
                    k = 0;
                    break;
                }
            }
            result += k;
        }
        System.out.print(result);
    }
}