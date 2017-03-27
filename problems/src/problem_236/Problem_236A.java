package problem_236;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_236A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toUpperCase();
        boolean[] array = new boolean[26];
        int temp, count = 0;

        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            if (!array[temp - 65])
                array[temp - 65] = true;
        }
        for (boolean anArray : array) {
            if (anArray)
                count++;
        }
        if (count % 2 == 0)
            System.out.print("CHAT WITH HER!");
        else
            System.out.print("IGNORE HIM!");
    }
}