package problem_439;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_439A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int songs = in.nextInt();
        int time = in.nextInt();
        int[] array = new int[songs];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        int temp = 0;
        for (int anArray : array) temp += anArray;
        temp += (songs - 1) * 10;

        int result = -1;
        if (temp <= time) {
            result = (time - temp) / 5 + ((songs - 1) * 2);
        }

        System.out.print(result);
    }
}