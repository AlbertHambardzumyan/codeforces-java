package problem_432;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_432A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int people = in.nextInt();
        int round = in.nextInt();
        int[] array = new int[people];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        int count = 0;
        for (int anArray : array) {
            if (5 - round >= anArray) {
                count++;
            }
        }

        System.out.print(count / 3);
    }
}