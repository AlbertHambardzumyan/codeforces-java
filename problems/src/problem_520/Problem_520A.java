package problem_520;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_520A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String input = in.nextLine().toUpperCase();
        int[] array = new int[26];
        String result = "YES";

        int temp;
        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            array[temp - 65]++;
        }
        for (int anArray : array) {
            if (anArray < 1) {
                result = "NO";
                break;
            }
        }
        System.out.print(result);
    }
}